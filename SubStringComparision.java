import java.util.Scanner;

public class SubStringComparision {
    public static String getSmallestAndLargest(String inputString, int k) {
        String smallestSubstring = "";
        String largestSubstring = "";
        smallestSubstring = largestSubstring = inputString.substring(0, k);
    
        for (int i = 1; i < inputString.length() - k + 1; i++) {
            String currentSubstring = inputString.substring(i, i + k);
            if (smallestSubstring.compareTo(currentSubstring) > 0)
                smallestSubstring = currentSubstring;
            if (largestSubstring.compareTo(currentSubstring) < 0)
                largestSubstring = currentSubstring;
        }
    
        // Complete the function
        // 'smallestSubstring' must be the lexicographically smallest substring of length 'k'
        // 'largestSubstring' must be the lexicographically largest substring of length 'k'
    
        return smallestSubstring + "\n" + largestSubstring;
    }
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
