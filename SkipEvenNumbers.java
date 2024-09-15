import java.util.Scanner;

public class SkipEvenNumbers {
    public static void main(String[] args) {
        // Step 1: Prompt the user to enter a positive integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        System.out.println("Odd numbers from 1 to " + n + ":");

        // Step 2: Use a for loop to iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            // Step 3: Use a continue statement to skip even numbers
            if (i % 2 == 0) {
                continue;
            }
            // Step 4: Display the odd numbers
            System.out.print(i + " ");
        }
    }
    Scanner.close();
}

