import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }

        System.out.println("Factorial of first " + n + " natural numbers: " + sum);
    }
}
