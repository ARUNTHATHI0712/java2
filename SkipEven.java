import java.util.Scanner;
public class SkipEven{
    public static void main(String[] args){
           Scanner n=new Scanner(System.in);
           int num1=n.nextInt();
           for(int i=0;i<=n;i++){
                if(i%2==0){
                       continue;
                }
                else{
                   System.out.print(i);
                 }
     }
   }
}