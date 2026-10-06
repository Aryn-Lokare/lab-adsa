# Breadth First Search (BFS) Graph Traversal

## Aim

To implement Breadth First Search (BFS) graph traversal using an adjacency matrix and a queue.

## Requirements

- Java JDK 8 or later
- Command Prompt, PowerShell, VS Code, IntelliJ IDEA, or any Java-compatible IDE

## How to Compile

```bash
javac BFSGraph.java
```

## How to Run

```bash
java BFSGraph
```

## Input Format
- Enter the number of vertices.
- Enter the adjacency matrix.
- Enter the starting vertex.
- `0` represents no edge.

## Example
For a graph with 5 vertices:

```text
5
0 1 1 0 0
1 0 0 1 0
1 0 0 0 1
0 1 0 0 1
0 0 1 1 0
0
```

One possible output is:

```text
BFS Traversal: 0 1 2 3 4
```

## Complexity
- With an adjacency matrix: `O(V^2)`
- Queue and visited array: `O(V)`

## Conclusion

The experiment successfully implements **Breadth First Search (BFS) Graph Traversal** in Java. The program accepts the required input, applies the appropriate data structure or algorithm, and produces the expected result. This experiment demonstrates the practical application of data structures and algorithms in solving computational problems.
