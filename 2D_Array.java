import java.util.Scanner;

public class MatrixTranspose {

    // Method to find the transpose of a matrix
    public static void transpose(int[][] matrix, int rows, int cols) {
        // Create a new matrix for storing the transpose
        int[][] transpose = new int[cols][rows];
        
        // Loop through the matrix to perform the transpose operation
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        // Print the transpose matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Read the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        // Create a matrix based on the input dimensions
        int[][] matrix = new int[rows][cols];
        
        // Read matrix elements from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Call the transpose method
        transpose(matrix, rows, cols);
        
        // Close the scanner
        scanner.close();
    }
}
