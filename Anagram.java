import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String strA, String strB) {
        // Complete the function
        String lowercaseA = strA.toLowerCase();
        String lowercaseB = strB.toLowerCase();
    
        if (lowercaseA.length() != lowercaseB.length())
            return false;
    
        for (int i = 0; i < lowercaseA.length(); i++) {
            int countA = 0;
            int countB = 0;
            for (int j = 0; j < lowercaseA.length(); j++) {
                if (lowercaseA.charAt(i) == lowercaseA.charAt(j))
                    countA++;
    
                if (lowercaseA.charAt(i) == lowercaseB.charAt(j))
                    countB++;
            }
            if (countA == countB)
                continue;
            else
                return false;
        }
    
        return true;
    }
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
