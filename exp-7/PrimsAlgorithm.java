import java.util.*;

public class PrimsAlgorithm {

    static void prim(int[][] graph) {
        int n = graph.length;
        int[] key = new int[n];
        int[] parent = new int[n];
        boolean[] inMST = new boolean[n];

        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        key[0] = 0;

        int totalCost = 0;

        System.out.println("\nEdges in Minimum Spanning Tree:");
        System.out.println("Edge\tWeight");

        for (int count = 0; count < n; count++) {
            int u = -1;
            int min = Integer.MAX_VALUE;

            for (int v = 0; v < n; v++) {
                if (!inMST[v] && key[v] < min) {
                    min = key[v];
                    u = v;
                }
            }

            if (u == -1) {
                System.out.println("Graph is disconnected. MST cannot be formed.");
                return;
            }

            inMST[u] = true;

            if (parent[u] != -1) {
                System.out.println(parent[u] + " - " + u + "\t" + graph[parent[u]][u]);
                totalCost += graph[parent[u]][u];
            }

            for (int v = 0; v < n; v++) {
                int weight = graph[u][v];

                if (weight != 0 && !inMST[v] && weight < key[v]) {
                    key[v] = weight;
                    parent[v] = u;
                }
            }
        }

        System.out.println("Total MST Cost = " + totalCost);
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
            }
        }

        prim(graph);
        sc.close();
    }
}
