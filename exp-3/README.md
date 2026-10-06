# Binary Tree Construction and Recursive Traversals

## Aim

To construct a binary tree from user input and perform Pre-order, In-order, and Post-order traversals recursively.

## Requirements

- Java JDK 8 or later
- Command Prompt, PowerShell, VS Code, IntelliJ IDEA, or any Java-compatible IDE

## How to Compile

```bash
javac BinaryTreeTraversals.java
```

## How to Run

```bash
java BinaryTreeTraversals
```

## Input Format
Enter node values recursively in preorder. Enter `-1` whenever a node has no child.

For example, the tree

```text
        1
       / \
      2   3
     / \
    4   5
```

can be entered as:

```text
1 2 4 -1 -1 5 -1 -1 3 -1 -1
```

## Expected Traversals

- Pre-order: `1 2 4 5 3`
- In-order: `4 2 5 1 3`
- Post-order: `4 5 2 3 1`

## Complexity
- Each traversal: `O(n)`
- Tree construction: `O(n)`
- Auxiliary recursion stack: `O(h)`, where `h` is tree height.

## Conclusion

The experiment successfully implements **Binary Tree Construction and Recursive Traversals** in Java. The program accepts the required input, applies the appropriate data structure or algorithm, and produces the expected result. This experiment demonstrates the practical application of data structures and algorithms in solving computational problems.
