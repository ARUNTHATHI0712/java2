import java.util.Random;
import java.util.Scanner;

public class MultiplicationPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean keepGoing = true;

        System.out.println("Welcome to the Multiplication Practice Program!");

        while (keepGoing) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;             
            System.out.println("What is " + num1 + " * " + num2 + "?");
            System.out.print("Enter your answer (or 0 to exit): ");
            int answer = scanner.nextInt();

            if (answer == 0) {
                keepGoing = false;
                System.out.println("Thank you for practicing multiplication!");
            } else if (answer == num1 * num2) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + (num1 * num2) + ".");
            }
        }

        scanner.close();
    }
}