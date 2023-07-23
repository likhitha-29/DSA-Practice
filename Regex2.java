import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex2 {
    public static void main(String[] args) {
        String duplicateWordRegex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern pattern = Pattern.compile(duplicateWordRegex, Pattern.CASE_INSENSITIVE);

        Scanner scanner = new Scanner(System.in);
        int numSentences = Integer.parseInt(scanner.nextLine());
        while (numSentences-- > 0) {
            String sentence = scanner.nextLine();

            Matcher matcher = pattern.matcher(sentence);
            while (matcher.find()) {
                sentence = sentence.replaceAll(matcher.group(), matcher.group(1));
            }
            System.out.println(sentence);
        }

        scanner.close();
    }
}
