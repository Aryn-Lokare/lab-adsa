# N-Queens Problem using Backtracking

## Aim

To implement the N-Queens problem using backtracking in Java to place $N$ queens on an $N \times N$ chessboard such that no two queens attack each other.

## Requirements

- Java JDK 8 or later
- Command Prompt, PowerShell, VS Code, IntelliJ IDEA, or any Java-compatible IDE

## How to Compile

```bash
javac NQueens.java
```

## How to Run

```bash
java NQueens
```

## Input Format

- Enter an integer $N$ representing the number of queens and the dimension of the $N \times N$ chessboard.

## Example

### Input:
```text
4
```

### Output:
```text
Solution 1:
 .   Q   .   . 
 .   .   .   Q 
 Q   .   .   . 
 .   .   Q   . 

Solution 2:
 .   .   Q   . 
 Q   .   .   . 
 .   .   .   Q 
 .   Q   .   . 

Total solutions found for N = 4: 2
```

## Complexity

- **Time Complexity:** $O(N!)$ in the worst case, as trying to place queens in every valid configuration explores a factorial branching tree pruned by backtracking.
- **Space Complexity:** $O(N^2)$ for the board representation (or $O(N)$ for recursion stack depth).

## Conclusion

The experiment successfully implements the **N-Queens Problem** using Backtracking in Java. The program explores valid queen placements column by column, prunes invalid paths, and outputs all non-attacking configurations along with the total count of valid solutions.
