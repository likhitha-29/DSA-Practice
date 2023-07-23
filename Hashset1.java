import java.util.HashSet;
import java.util.Scanner;

public class Hashset1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int t = s.nextInt();
        String [] l = new String[t];
        String [] r = new String[t];
        
        for (int i = 0; i < t; i++) {
            l[i] = s.next();
            r[i] = s.next();
        }
HashSet<String> pairs = new HashSet<String>(t);
    for(int i = 0; i < t; i++)
    {
        pairs.add("(" + l[i] + ", " + r[i] + ")" );
        System.out.println(pairs.size());        
    } 
    }
}
