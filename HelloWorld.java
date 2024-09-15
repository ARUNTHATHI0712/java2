import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int st=1;
        int n=a.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=1;s<=(n-i);s++)
                System.out.println(" ");
            for(int j=1;j<st;j++)
                    System.out.println("*");
                System.out.println();
                st+=2;
                
            
        }
    }
}