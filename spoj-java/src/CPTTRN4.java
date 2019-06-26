import java.util.Scanner;

class CPTTRN4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int r = in.nextInt();
            int c = in.nextInt();
            int h = in.nextInt();
            int w = in.nextInt();

            int width = c * (w + 1) + 1;

            for (int i = 0; i < r; i++) {
                for(int k = 0; k < width; k++)
                    System.out.print("*");
                System.out.println();
                for(int l = 0; l < h; l++) {
                    for (int j = 0; j < width; j++) {
                        if(j % (w + 1) == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println();
                }
            }

            for(int k = 0; k < width; k++)
                System.out.print("*");
            System.out.println();
            System.out.println();
        }
    }
}