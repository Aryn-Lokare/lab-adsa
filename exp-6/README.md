# Optimal Storage on Tape

## Aim

To implement the Optimal Storage on Tape algorithm and determine the storage order of programs so that Mean Retrieval Time (MRT) is minimized.

## Requirements

- Java JDK 8 or later
- Command Prompt, PowerShell, VS Code, IntelliJ IDEA, or any Java-compatible IDE

## How to Compile

```bash
javac OptimalStorageOnTape.java
```

## How to Run

```bash
java OptimalStorageOnTape
```

## Algorithm
1. Read all program lengths.
2. Sort program lengths in ascending order.
3. Store the shortest program first.
4. Calculate the cumulative retrieval time for every program.
5. Calculate:

```text
MRT = Sum of Retrieval Times / Number of Programs
```

## Example
Input:

```text
4
5 2 8 3
```

Optimal order:

```text
2 3 5 8
```

Retrieval times:

```text
2, 5, 10, 18
```

Therefore:

```text
MRT = (2 + 5 + 10 + 18) / 4 = 8.75
```

## Complexity
- Sorting: `O(n log n)`
- MRT calculation: `O(n)`
- Overall: `O(n log n)`

## Conclusion

The experiment successfully implements **Optimal Storage on Tape** in Java. The program accepts the required input, applies the appropriate data structure or algorithm, and produces the expected result. This experiment demonstrates the practical application of data structures and algorithms in solving computational problems.
