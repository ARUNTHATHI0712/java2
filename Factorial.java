import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        int n,fact;
        fact=1;

        System.out.println("Enter a positive integer:" );
        n=a.nextInt();
        for(int i=1;i<=n;i++){
            fact*=i;
         }
        System.out.println("Factorial of natural numbers: "+fact);
    }
    
}
