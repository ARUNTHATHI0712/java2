import java.util.Scanner;
public class Password{
   public static void main(String[] args){
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a password:");
      String a=scanner.nextLine();
      String b="PASSWORD";
      
      if(a=="PASSWORD")
           System.out.print("Password accepted.");
      else
           System.out.print("Incorrect password. Try again. " );
}
}