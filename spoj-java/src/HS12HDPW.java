import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HS12HDPW {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-- > 0) {
            int n = in.nextInt();
            List<String> tuples = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                tuples.add(in.next());
            }
            char[] encodedString =  in.next().toCharArray();
            for(int i = 0; i < n; i++) {
                String tuple = tuples.get(i);
                int a = 0;
                int b = 0;
                StringBuilder binaryA = new StringBuilder();
                StringBuilder binaryB = new StringBuilder();

                for(int k = 0; k < tuple.length(); k++) {
                    String binary = Integer.toBinaryString((int)tuple.charAt(k));
                    int indexForA = binary.length() - k - 1;
                    int indexForB = binary.length() - ((k + 3) % 6) - 1;
                    binaryA.append(binary.charAt(indexForA));
                    binaryB.append(binary.charAt(indexForB));
                }

                binaryA = binaryA.reverse();
                binaryB = binaryB.reverse();

                a = Integer.parseInt(binaryA.toString(), 2);
                b = Integer.parseInt(binaryB.toString(), 2);

                System.out.print(encodedString[a] + "" + encodedString[b]);
            }
            System.out.println();
        }
    }
}