import java.util.Scanner;

public class NumberOrderCheck {
    
    // Method to check the order of three numbers
    public static void checkOrder(int num1, int num2, int num3) {
        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Accept three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Call the method to check the order of numbers
        checkOrder(num1, num2, num3);
        
        // Close the scanner
        scanner.close();
    }
}