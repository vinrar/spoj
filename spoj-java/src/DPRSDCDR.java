import java.util.Scanner;

public class DPRSDCDR {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-- > 0) {
            long sum = 10;
            int nCT = in.nextInt();
            int nLR = in.nextInt();
            int tCT = in.nextInt() * nCT;
            int tLR = in.nextInt() * nLR;
            sum += in.nextInt() + tCT + tLR;
            if(24 - sum >= 3) {
                System.out.println("Khushi");
            } else {
                System.out.println("Hotash");
            }
        }
    }
}
