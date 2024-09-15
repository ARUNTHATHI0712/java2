import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        long factorial = 1; // Use long to handle large values
        for (int i = 1; i <= n; i++) {