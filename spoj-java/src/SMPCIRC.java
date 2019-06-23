import java.util.Scanner;

public class SMPCIRC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-- > 0) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int r1 = in.nextInt();

            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int r2 = in.nextInt();

            double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            double rDiff = Math.abs(r1 - r2);

            if(dist == rDiff) {
                System.out.println("E");
            } else if(dist < rDiff) {
                System.out.println("I");
            } else {
                System.out.println("O");
            }
        }
    }
}