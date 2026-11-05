# OOP Practice – Driver Class

**Date:** 5 November 2026

## Topic: Encapsulation, Constructors, Static Members and Immutability

## What does the Driver class do?

The `Driver` class represents a driver in an Uber-like driver management system.

It manages driver information such as driver ID, name, rating and phone number. It also enforces rules such as rating validation, protecting personal information through phone number masking, checking onboarding eligibility and maintaining a system-wide count of onboarded drivers.

## Design Decisions and Rules

| Decision                                       | What rule it encodes                                                     |
| ---------------------------------------------- | ------------------------------------------------------------------------ |
| `private` on all fields                        | No external code can directly read or modify driver data                 |
| `setRating()` with validation                  | Uber ratings must be between 1.0 and 5.0                                 |
| `private final String driverId`                | A driver's ID is assigned at registration and never changes              |
| `getMaskedPhone()` instead of `getPhone()`     | Riders see only a masked number, not the full phone                      |
| `static int totalDriversOnboarded`             | There is one system-wide driver count, not one per object                |
| `static boolean isEligibleToOnboard(...)`      | Eligibility is a class-level rule, not a property of any specific driver |
| `totalDriversOnboarded++` in both constructors | The count increments every time any Driver object is created             |

## Key Takeaways

- **Encapsulation:** Keep fields private and control access through methods.
- **Validation:** A class should enforce rules to maintain valid object state.
- **Immutability:** Use `final` when a field should not change after initialization.
- **Static variables:** Shared data belongs to the class rather than individual objects.
- **Static methods:** Use them for operations that do not depend on a particular object's state.
- **Constructors:** Constructors initialize objects and can also perform necessary initialization logic.
- **Data protection:** Expose only the information that other parts of the application need.