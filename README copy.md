# Longest Common Subsequence (LCS)

## Aim

To implement the Longest Common Subsequence (LCS) algorithm for two input strings using dynamic programming and display the longest matching subsequence.

## Requirements

- Java JDK 8 or later
- Command Prompt, PowerShell, VS Code, IntelliJ IDEA, or any Java-compatible IDE

## How to Compile

```bash
javac LCS.java
```

## How to Run

```bash
java LCS
```

## Algorithm
For every pair of prefixes of the two strings:

- If the current characters match, add `1` to the diagonal value.
- Otherwise, take the maximum of the top and left values.
- Backtrack through the DP table to reconstruct the actual subsequence.

## Example
Input:

```text
ABCBDAB
BDCABA
```

A valid output is:

```text
Longest Common Subsequence: BCBA
LCS Length: 4
```

There can be more than one valid LCS of the same maximum length.

## Complexity
- Time: `O(m × n)`
- Space: `O(m × n)`

where `m` and `n` are the lengths of the two strings.

## Conclusion

The experiment successfully implements **Longest Common Subsequence (LCS)** in Java. The program accepts the required input, applies the appropriate data structure or algorithm, and produces the expected result. This experiment demonstrates the practical application of data structures and algorithms in solving computational problems.
