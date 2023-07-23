import java.io.IOException;
import java.util.Scanner;

public class Array_1D {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++) {
            System.out.println(a[i]);
        }
    }
}