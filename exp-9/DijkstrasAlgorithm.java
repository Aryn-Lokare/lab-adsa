import java.util.*;

public class DijkstrasAlgorithm {

    static int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < min) {
                min = dist[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    static void printPath(int[] parent, int vertex) {
        if (vertex == -1) return;
        printPath(parent, parent[vertex]);
        System.out.print(vertex + " ");
    }

    static void dijkstra(int[][] graph, int source) {
        int n = graph.length;
        int[] dist = new int[n];
        int[] parent = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        dist[source] = 0;

        for (int count = 0; count < n; count++) {
            int u = minDistance(dist, visited);

            if (u == -1) break;

            visited[u] = true;

            for (int v = 0; v < n; v++) {
                int weight = graph[u][v];

                if (weight != 0 && !visited[v]
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + weight < dist[v]) {

                    dist[v] = dist[u] + weight;
                    parent[v] = u;
                }
            }
        }

        System.out.println("\nVertex\tDistance\tPath");

        for (int v = 0; v < n; v++) {
            System.out.print(v + "\t");

            if (dist[v] == Integer.MAX_VALUE) {
                System.out.println("INF\t\tNo path");
            } else {
                System.out.print(dist[v] + "\t\t");
                printPath(parent, v);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter weighted adjacency matrix (0 means no edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();

                if (graph[i][j] < 0) {
                    System.out.println("Dijkstra's algorithm does not allow negative edge weights.");
                    sc.close();
                    return;
                }
            }
        }

        System.out.print("Enter source vertex (0 to " + (n - 1) + "): ");
        int source = sc.nextInt();

        if (source < 0 || source >= n) {
            System.out.println("Invalid source vertex.");
        } else {
            dijkstra(graph, source);
        }

        sc.close();
    }
}
