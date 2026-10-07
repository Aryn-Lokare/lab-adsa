# Dijkstra's Shortest Path Algorithm

## Aim

To find the shortest paths from a single source vertex to all other vertices in a weighted graph using Dijkstra's algorithm.

## Requirements

- Java JDK 8 or later
- Command Prompt, PowerShell, VS Code, IntelliJ IDEA, or any Java-compatible IDE

## How to Compile

```bash
javac DijkstrasAlgorithm.java
```

## How to Run

```bash
java DijkstrasAlgorithm
```

## Input Format
- Enter the number of vertices.
- Enter a weighted adjacency matrix.
- Use `0` for no edge.
- Enter the source vertex.
- All edge weights must be non-negative.

## Example
Input:

```text
5
0 10 0 5 0
0 0 1 2 0
0 0 0 0 4
0 3 9 0 2
7 0 6 0 0
0
```

The program displays the shortest distance and path from source vertex `0` to every reachable vertex.

## Complexity
Using an adjacency matrix:
- Time: `O(V^2)`
- Space: `O(V)`

Dijkstra's algorithm is not suitable for graphs containing negative edge weights.

## Conclusion

The experiment successfully implements **Dijkstra's Shortest Path Algorithm** in Java. The program accepts the required input, applies the appropriate data structure or algorithm, and produces the expected result. This experiment demonstrates the practical application of data structures and algorithms in solving computational problems.
