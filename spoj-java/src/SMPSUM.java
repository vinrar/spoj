import java.util.Scanner;

public class SMPSUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        x = x - 1;
        int ssX = (x * (x + 1) * (2*x + 1))/6;
        int ssY = (y * (y + 1) * (2*y + 1))/6;
        System.out.println(ssY - ssX);
    }
}
