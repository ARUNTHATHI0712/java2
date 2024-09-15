import java.util.Scanner;
public class Divide{
  public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       System.out.println("enter a number");
       int n=scanner.nextInt();
       System.out.println("Enter a divisor:");
       int d=scanner.nextInt();
       int res=n/d;
       System.out.println(res);
}
}