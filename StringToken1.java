import java.util.Scanner;

public class StringToken1 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Write your code here.
         s = s.trim(); // so that .split() works properly
        
        /* Check special cases */
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        /* Split on all non-alphabetic characters */
        String [] words = s.split("[^a-zA-Z]+");
        
        /* Print output */
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
