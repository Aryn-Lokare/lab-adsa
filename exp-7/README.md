# Prim's Algorithm

## Aim

To implement Prim's algorithm to find a Minimum Spanning Tree (MST) of a connected weighted graph.

## Requirements

- Java JDK 8 or later
- Command Prompt, PowerShell, VS Code, IntelliJ IDEA, or any Java-compatible IDE

## How to Compile

```bash
javac PrimsAlgorithm.java
```

## How to Run

```bash
java PrimsAlgorithm
```

## Input Format
Enter a weighted adjacency matrix. Use `0` when there is no edge.

The graph should be connected and edge weights should be positive.

## Example
Input:

```text
5
0 2 0 6 0
2 0 3 8 5
0 3 0 0 7
6 8 0 0 9
0 5 7 9 0
```

One valid MST is:

```text
0 - 1  (2)
1 - 2  (3)
1 - 4  (5)
0 - 3  (6)
```

Total MST cost:

```text
16
```

## Complexity
Using an adjacency matrix and linear minimum selection:
- Time: `O(V^2)`
- Space: `O(V)`

## Conclusion

The experiment successfully implements **Prim's Algorithm** in Java. The program accepts the required input, applies the appropriate data structure or algorithm, and produces the expected result. This experiment demonstrates the practical application of data structures and algorithms in solving computational problems.
