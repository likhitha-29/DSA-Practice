import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TagContentExtracter {
    public static void main(String[] args) {
        // Define the regex pattern to match XML-style tags and capture content
        Pattern xmlTagPattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>");

        Scanner scanner = new Scanner(System.in);
        int numTestCases = Integer.parseInt(scanner.nextLine());

        // Process each test case
        while (numTestCases > 0) {
            String line = scanner.nextLine();
            Matcher matcher = xmlTagPattern.matcher(line);

            int matches = 0;
            // Find and print the content between matching XML-style tags
            while (matcher.find()) {
                matches++;
                System.out.println(matcher.group(2));
            }

            // If no matches were found, print "None"
            if (matches == 0) {
                System.out.println("None");
            }

            // Decrease the number of test cases
            numTestCases--;
        }

        scanner.close();
    }
}

