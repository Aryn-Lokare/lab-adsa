# Merge Sort in Java

A simple, recursive implementation of the **Merge Sort** algorithm in Java, sorting an array of integers in ascending order.

## Overview

Merge Sort is a divide-and-conquer sorting algorithm. It works by:

1. **Divide:** Recursively splitting the array into two halves until each sub-array has one element.
2. **Conquer:** A single-element array is already sorted.
3. **Merge:** Combining two sorted halves into one sorted array by repeatedly picking the smaller front element.

## Project Structure

```
.
├── MergeSort.java
└── README.md
```

## Requirements

- Java Development Kit (JDK) 8 or higher

Check your installation with:

```bash
java -version
javac -version
```

## How to Run

1. Compile the program:

   ```bash
   javac MergeSort.java
   ```

2. Run it:

   ```bash
   java MergeSort
   ```

## Example Output

```
Original array: [38, 27, 43, 3, 9, 82, 10]
Sorted array:   [3, 9, 10, 27, 38, 43, 82]
```

## Usage in Your Own Code

Call `mergeSort` with the array and the index range to sort:

```java
int[] data = {5, 2, 9, 1, 7};
MergeSort.mergeSort(data, 0, data.length - 1);
System.out.println(Arrays.toString(data)); // [1, 2, 5, 7, 9]
```

## Methods

| Method                                           | Description                                                               |
| ------------------------------------------------ | ------------------------------------------------------------------------- |
| `mergeSort(int[] arr, int left, int right)`      | Recursively sorts `arr` between indices `left` and `right` (inclusive).   |
| `merge(int[] arr, int left, int mid, int right)` | Merges two sorted sub-arrays `[left..mid]` and `[mid+1..right]` into one. |
| `main(String[] args)`                            | Demo entry point that sorts a sample array and prints the result.         |

## Complexity

| Case    | Time       |
| ------- | ---------- |
| Best    | O(n log n) |
| Average | O(n log n) |
| Worst   | O(n log n) |

- **Space complexity:** O(n), due to the temporary arrays used while merging.
- **Stable:** Yes. Equal elements keep their original relative order (thanks to the `<=` comparison in `merge`).
- **In-place:** No, it requires extra memory.

## License

This project is free to use for learning and educational purposes.
