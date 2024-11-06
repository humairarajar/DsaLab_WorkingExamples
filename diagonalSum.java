import java.util.Scanner;

public class DiagonalSums {

    // Method to calculate the diagonal sums
    public static void calculateDiagonals(int[][] matrix, int n) {
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < n; i++) {
            leftSum += matrix[i][i]; // Left diagonal sum
            rightSum += matrix[i][n - 1 - i]; // Right diagonal sum
        }
        System.out.println("Left diagonal sum: " + leftSum);
        System.out.println("Right diagonal sum: " + rightSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read matrix size
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[n][n];

        // Read matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print diagonal sums
        calculateDiagonals(matrix, n);

        scanner.close();
    }
}