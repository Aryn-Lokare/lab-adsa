import java.util.*;

public class HamiltonianCycle {

    // Check if vertex v can be added at index pos in the Hamiltonian Cycle
    static boolean isSafe(int v, int[][] graph, int[] path, int pos) {
        // Check if this vertex is adjacent to the previously added vertex
        if (graph[path[pos - 1]][v] == 0) {
            return false;
        }

        // Check if the vertex has already been included in the path
        for (int i = 0; i < pos; i++) {
            if (path[i] == v) {
                return false;
            }
        }

        return true;
    }

    // Recursive utility function to solve Hamiltonian Cycle problem using Backtracking
    static boolean hamCycleUtil(int[][] graph, int[] path, int pos, int v) {
        // Base case: If all vertices are included in Hamiltonian Cycle
        if (pos == v) {
            // Check if there is an edge from the last vertex to the first vertex
            return graph[path[pos - 1]][path[0]] == 1;
        }

        // Try different vertices as candidates in the Hamiltonian Cycle
        for (int vertex = 1; vertex < v; vertex++) {
            if (isSafe(vertex, graph, path, pos)) {
                path[pos] = vertex;

                // Recur to construct the rest of the path
                if (hamCycleUtil(graph, path, pos + 1, v)) {
                    return true;
                }

                // Backtrack
                path[pos] = -1;
            }
        }

        return false;
    }

    // Solves the Hamiltonian Cycle problem using Backtracking
    static void findHamiltonianCycle(int[][] graph, int v) {
        int[] path = new int[v];
        Arrays.fill(path, -1);

        // Put vertex 0 as the first vertex in the path
        path[0] = 0;

        if (!hamCycleUtil(graph, path, 1, v)) {
            System.out.println("\nNo Hamiltonian Cycle exists in the given graph.");
            return;
        }

        System.out.println("\nHamiltonian Cycle found:");
        for (int i = 0; i < v; i++) {
            System.out.print(path[i] + " -> ");
        }
        System.out.println(path[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        if (v <= 0) {
            System.out.println("Number of vertices must be greater than 0.");
            sc.close();
            return;
        }

        int[][] graph = new int[v][v];
        System.out.println("Enter the adjacency matrix (0 or 1):");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        findHamiltonianCycle(graph, v);

        sc.close();
    }
}
