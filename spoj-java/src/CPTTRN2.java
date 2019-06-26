import java.util.Scanner;

class CPTTRN2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int r = in.nextInt();
            int c = in.nextInt();

            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    if(i == 0 || i == r - 1 || j == 0 || j == c - 1)
                        System.out.print("*");
                    else
                        System.out.print(".");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
