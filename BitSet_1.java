import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;
public class BitSet_1 {
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        StringTokenizer tokenizer = new StringTokenizer(input);
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        BitSet bitSet1 = new BitSet(N);
        BitSet bitSet2 = new BitSet(N);
        while (M-- > 0) {
            input = reader.readLine().trim();
            tokenizer = new StringTokenizer(input);
            String instruction = tokenizer.nextToken();
            int setIndex = Integer.parseInt(tokenizer.nextToken());
            int bitIndex = Integer.parseInt(tokenizer.nextToken());
            switch (instruction) {
                case "AND":
                    if (setIndex == 1)
                        bitSet1.and(bitSet2);
                    else
                        bitSet2.and(bitSet1);
                    break;
                case "OR":
                    if (setIndex == 1)
                        bitSet1.or(bitSet2);
                    else
                        bitSet2.or(bitSet1);
                    break;
                case "XOR":
                    if (setIndex == 1)
                        bitSet1.xor(bitSet2);
                    else
                        bitSet2.xor(bitSet1);
                    break;
                case "FLIP":
                    if (setIndex == 1)
                        bitSet1.flip(bitIndex);
                    else
                        bitSet2.flip(bitIndex);
                    break;
                case "SET":
                    if (setIndex == 1)
                        bitSet1.set(bitIndex);
                    else
                        bitSet2.set(bitIndex);
                    break;
            }
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
    }
}
