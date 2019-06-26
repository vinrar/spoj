import java.util.Scanner;

public class ADDREV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();

            int reva = 0;
            int revb = 0;

            while(a > 0) {
                reva *= 10;
                reva += a % 10;
                a = a/10;
            }

            while(b > 0) {
                revb *= 10;
                revb += b % 10;
                b = b/10;
            }

            reva += revb;
            revb = 0;
            while(reva > 0) {
                revb *= 10;
                revb += reva % 10;
                reva = reva/10;
            }

            System.out.println(revb);
        }
    }
}
