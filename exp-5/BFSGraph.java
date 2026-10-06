import java.util.*;

public class BFSGraph {

    static void bfs(int[][] graph, int start) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int i = 0; i < n; i++) {
                if (graph[current][i] != 0 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter adjacency matrix (0 means no edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter starting vertex (0 to " + (n - 1) + "): ");
        int start = sc.nextInt();

        if (start < 0 || start >= n) {
            System.out.println("Invalid starting vertex.");
        } else {
            bfs(graph, start);
        }

        sc.close();
    }
}
