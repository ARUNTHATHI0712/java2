import java.util.Scanner;

public class Marks{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your marks:");
        int marks = scanner.nextInt();
        
        if (marks >= 50) {
            System.out.println("Pass");
        } 
        
        else{
            System.out.println("Fail");
        } 
        scanner.close();
    }
}