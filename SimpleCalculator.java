import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                running = false;
            }
        }
        scanner.close();
    }
}
