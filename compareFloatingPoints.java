import java.util.Scanner;

public class CompareFloatingPoint {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Read two floating-point numbers
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();
        
        // Round both numbers to 3 decimal places
        num1 = Math.round(num1 * 1000.0) / 1000.0;
        num2 = Math.round(num2 * 1000.0) / 1000.0;
        
        // Compare the rounded values
        if (num1 == num2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
