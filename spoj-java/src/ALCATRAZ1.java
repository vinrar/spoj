import java.util.Scanner;

public class ALCATRAZ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        long out = 0;
        String arr;
        while(n-- > 0) {
            arr = in.nextLine();
            out = 0;
            long len = arr.length();
            for(int i = 0; i < len; i++) {
                out += arr.charAt(i);
            }
            System.out.println(out - 48 * len);
        }
    }
}