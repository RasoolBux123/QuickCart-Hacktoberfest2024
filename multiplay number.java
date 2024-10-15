import java.util.Scanner;

public class MultiplyNumbers {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Multiply the two numbers
        double result = num1 * num2;

        // Output the result
        System.out.println("The result of multiplication is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
