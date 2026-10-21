# Hamiltonian Cycle using Backtracking

## Aim

To implement the Hamiltonian Cycle problem in an undirected graph using backtracking in Java to determine whether a given graph contains a Hamiltonian Cycle and display the cycle if one exists.

## Requirements

- Java JDK 8 or later
- Command Prompt, PowerShell, VS Code, IntelliJ IDEA, or any Java-compatible IDE

## How to Compile

```bash
javac HamiltonianCycle.java
```

## How to Run

```bash
java HamiltonianCycle
```

## Input Format

- Enter the number of vertices $V$.
- Enter the $V \times V$ adjacency matrix containing `0` or `1`:
  - `1` indicates an edge between vertex $i$ and vertex $j$.
  - `0` indicates no edge between vertex $i$ and vertex $j$.

## Example

### Input:
```text
5
0 1 0 1 0
1 0 1 1 1
0 1 0 0 1
1 1 0 0 1
0 1 1 1 0
```

### Output:
```text
Hamiltonian Cycle found:
0 -> 1 -> 2 -> 4 -> 3 -> 0
```

## Complexity

- **Time Complexity:** $O(V!)$ in the worst case, as the algorithm explores permutations of vertices and prunes non-promising paths using backtracking.
- **Space Complexity:** $O(V)$ to store the cycle path array and handle the recursive call stack.

## Conclusion

The experiment successfully implements the **Hamiltonian Cycle Problem** using Backtracking in Java. The program constructs the cycle path vertex by vertex, backtracks whenever a dead end is encountered, and displays the valid closed cycle visiting every vertex exactly once.
