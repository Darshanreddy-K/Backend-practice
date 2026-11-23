package Callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSortTask implements Callable<List<Integer>> {
    private final List<Integer> list;
    private final ExecutorService pool;   // the SAME shared pool, passed in

    public MergeSortTask(List<Integer> list, ExecutorService pool) {
        this.list = list;
        this.pool = pool;
    }

    @Override
    public List<Integer> call() throws Exception {
        // base case: a list of 0 or 1 element is already sorted
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Integer> left  = new ArrayList<>(list.subList(0, mid));
        List<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

        // submit BOTH first -> both halves sort AT THE SAME TIME
        Future<List<Integer>> leftFuture  = pool.submit(new MergeSortTask(left, pool));
        Future<List<Integer>> rightFuture = pool.submit(new MergeSortTask(right, pool));

        // collect AFTER -> get back both claim slips
        List<Integer> sortedLeft  = leftFuture.get();
        List<Integer> sortedRight = rightFuture.get();

        return merge(sortedLeft, sortedRight);
    }

    private List<Integer> merge(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) result.add(a.get(i++));
            else                      result.add(b.get(j++));
        }
        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));
        return result;
    }
}