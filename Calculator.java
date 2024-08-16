import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operation (+, -, *, /):");
        String operation = scanner.next();

        System.out.println("Enter another number:");
        double num2 = scanner.nextDouble();

        double result = 0;

        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else if (operation.equals("*")) {
            result = num1 * num2;
        } else if (operation.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                return;
            }
        } else {
            System.out.println("Error: Invalid operation!");
            return;
        }

        System.out.println("Result: " + result);
    }
}