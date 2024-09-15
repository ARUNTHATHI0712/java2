import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("size");
        int size=scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
     }
}
             