# HashMap Operations Demo in Java

A small Java program that demonstrates the most common operations of `java.util.HashMap`, using a map of **country → population** (values are illustrative).

## Overview

A `HashMap` stores data as **key–value pairs** and uses hashing to give fast lookups, insertions, and deletions. This program walks through each basic operation step by step and prints the result.

## Project Structure

```
.
├── HashFunction.java
└── README.md
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## How to Run

1. Compile:

   ```bash
   javac HashFunction.java
   ```

2. Run:

   ```bash
   java HashFunction
   ```

## Operations Demonstrated

| Operation       | Method used            | What the program does                            |
| --------------- | ---------------------- | ------------------------------------------------ |
| Insert          | `put(key, value)`      | Adds 9 countries with their population values    |
| Search by key   | `containsKey("India")` | Checks whether "India" exists in the map         |
| Get             | `get("India")`         | Retrieves the value for "India" (`120`)          |
| Remove          | `remove("China")`      | Deletes the "China" entry                        |
| Search by value | `containsValue(120)`   | Checks whether any entry has the value `120`     |
| Size            | `size()`               | Prints the number of entries (`8` after removal) |
| Empty check     | `isEmpty()`            | Checks whether the map has no entries            |
| Clear           | `clear()`              | Removes all entries, leaving `{}`                |

## Expected Output

The exact order of entries when printing a `HashMap` is **not guaranteed**, so the lines showing the full map may list entries in a different order on your machine. The remaining lines are:

```
Key is present in the map
120
Value is present in the map
8
Map is not empty
{}
```

The first line printed is the full map with all 9 entries, and the line after `120` is the map again without `China`.

## Key Concepts

- **Unique keys:** Putting a value with an existing key replaces the old value.
- **Unordered:** `HashMap` does not maintain insertion order. Use `LinkedHashMap` for insertion order or `TreeMap` for sorted keys.
- **Null support:** Allows one `null` key and multiple `null` values.
- **Not thread-safe:** Use `ConcurrentHashMap` for concurrent access.

## Time Complexity

| Operation         | Average | Worst case |
| ----------------- | ------- | ---------- |
| `put`             | O(1)    | O(n)\*     |
| `get`             | O(1)    | O(n)\*     |
| `remove`          | O(1)    | O(n)\*     |
| `containsKey`     | O(1)    | O(n)\*     |
| `containsValue`   | O(n)    | O(n)       |
| `size`, `isEmpty` | O(1)    | O(1)       |
| `clear`           | O(n)    | O(n)       |

\* Worst case occurs with many hash collisions. Since Java 8, heavily collided buckets are converted to balanced trees, reducing this to O(log n).

## License

This project is free to use for learning and educational purposes.
