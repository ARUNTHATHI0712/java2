import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        int n,sum;
        sum=0;

        System.out.println("Enter a positive integer:" );
        n=a.nextInt();
        for(int i=0;i<n;i++){
            sum+=i;
         }
        System.out.println("Sum of natural numbers: "+sum);
    }
    
}
