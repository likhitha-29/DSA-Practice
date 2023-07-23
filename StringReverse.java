import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        
        /* Reverse string and compare to original */
        /* If a String is equivalent to itself when reversed, it's a palindrome */
        
        String reversed = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(reversed) ? "Yes" : "No");
    }
}
