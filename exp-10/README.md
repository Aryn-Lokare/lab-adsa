# Floyd-Warshall All-Pairs Shortest Paths

## Aim

To implement the Floyd-Warshall algorithm for computing the shortest paths between every pair of vertices in a weighted graph using an adjacency matrix.

## Requirements

- Java JDK 8 or later
- Command Prompt, PowerShell, VS Code, IntelliJ IDEA, or any Java-compatible IDE

## How to Compile

```bash
javac FloydWarshall.java
```

## How to Run

```bash
java FloydWarshall
```

## Input Format
Enter a weighted adjacency matrix.

- `0` means there is no direct edge.
- Diagonal entries represent the same vertex and are treated as `0`.
- The implementation also works with negative edge weights, provided there is no negative cycle.

## Example
Input:

```text
4
0 5 0 10
0 0 3 0
0 0 0 1
0 0 0 0
```

The algorithm considers every vertex as an intermediate vertex and produces the final shortest-path matrix.

## Complexity
- Time: `O(V^3)`
- Space: `O(V^2)`

## Conclusion

The experiment successfully implements **Floyd-Warshall All-Pairs Shortest Paths** in Java. The program accepts the required input, applies the appropriate data structure or algorithm, and produces the expected result. This experiment demonstrates the practical application of data structures and algorithms in solving computational problems.
