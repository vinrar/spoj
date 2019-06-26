import java.util.Scanner;

class CPTTRN1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int r = in.nextInt();
            int c = in.nextInt();
            boolean b = false;
            boolean flip = true;
            for(int i = 0; i < r; i++) {
                b = flip;
                for(int j = 0; j < c; j++) {
                    if(b)
                        System.out.print("*");
                    else
                        System.out.print(".");

                    b = !b;
                }
                flip = !flip;
                System.out.println();
            }
            System.out.println();
        }
    }
}
