import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        ArrayList[] arr=new ArrayList[30000];
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            arr[i]=new ArrayList();
            int m=sc.nextInt();
            for(int j=1;j<=m;j++) {
                int data=sc.nextInt();
                arr[i].add(data);
            }
        }
        int q=sc.nextInt();
        for(int i=1;i<=q;i++) {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            try {
            System.out.println(arr[x].get(y-1));
            }
            catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
