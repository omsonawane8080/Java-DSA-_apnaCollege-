import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        // Displaying operation choices
        System.out.println("Choose an operation:");
        System.out.println("1: + (Addition)");
        System.out.println("2: - (Subtraction)");
        System.out.println("3: * (Multiplication)");
        System.out.println("4: / (Division)");
        System.out.println("5: % (Modulo)");

        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        // Performing calculation based on user choice
        double result = 0;
        boolean validChoice = true;

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Result: " + a + " + " + b + " = " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result: " + a + " - " + b + " = " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result: " + a + " * " + b + " = " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + a + " / " + b + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validChoice = false;
                }
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result: " + a + " % " + b + " = " + result);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                    validChoice = false;
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                validChoice = false;
        }

        scanner.close();
    }
}
