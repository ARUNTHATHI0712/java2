import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        // Step 1: Prompt the user to enter a positive integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of levels for the pyramid: ");
        int n = scanner.nextInt();

        // Step 2: Use nested for loops to print the pyramid pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line after each level
            System.out.println();
        }
    }
}

        