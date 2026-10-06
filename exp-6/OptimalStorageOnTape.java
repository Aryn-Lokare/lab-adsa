import java.util.*;

public class OptimalStorageOnTape {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of programs: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of programs must be positive.");
            sc.close();
            return;
        }

        int[] length = new int[n];

        System.out.println("Enter the length of each program:");
        for (int i = 0; i < n; i++) {
            length[i] = sc.nextInt();
            if (length[i] <= 0) {
                System.out.println("Program lengths must be positive.");
                sc.close();
                return;
            }
        }

        // Shortest programs first minimize total and mean retrieval time.
        Arrays.sort(length);

        long totalRetrievalTime = 0;
        long cumulativeTime = 0;

        System.out.println("\nOptimal storage order:");
        System.out.println("Program\tLength\tRetrieval Time");

        for (int i = 0; i < n; i++) {
            cumulativeTime += length[i];
            totalRetrievalTime += cumulativeTime;

            System.out.println((i + 1) + "\t" + length[i] + "\t" + cumulativeTime);
        }

        double mrt = (double) totalRetrievalTime / n;

        System.out.println("\nTotal Retrieval Time = " + totalRetrievalTime);
        System.out.printf("Mean Retrieval Time (MRT) = %.2f%n", mrt);

        sc.close();
    }
}

