import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Step 1: Prompt the user to enter a positive integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int n = scanner.nextInt();

        // Step 2: Use nested for loops to generate and display the multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print the product followed by a tab for spacing
                System.out.print(i * j + "\t");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
