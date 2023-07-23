import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class List1 {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new LinkedList<>();
        for(int i=0;i<n;i++) {
            int vals=sc.nextInt();
            l.add(vals);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++) {
            String s=sc.next();
            if(s.equals("Insert")) {
            int in=sc.nextInt();
            int v=sc.nextInt();
            l.add(in,v);
            }
            else {
                int in=sc.nextInt();
                l.remove(in);
            }
        }
        for(Integer x:l) {
            System.out.print(x+" ");
        }
    }
}
