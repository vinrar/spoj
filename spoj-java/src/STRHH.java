import java.util.Scanner;

public class STRHH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            String input = in.next();
            for(int i = 0; i < (input.length())/2; i+=2) {
                System.out.print(input.charAt(i));
            }
            System.out.println();
        }
    }
}
