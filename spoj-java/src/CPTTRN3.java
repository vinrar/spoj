import java.util.Scanner;

class CPTTRN3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int r = in.nextInt();
            int c = in.nextInt();

            for (int i = 0; i < r; i++) {
                for(int k = 0; k < 3*c+1; k++)
                    System.out.print("*");
                System.out.println();
                for(int l = 0; l < 2; l++) {
                    for (int j = 0; j < 3*c + 1; j++) {
                        if(j % 3 == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println();
                }
            }
            for(int k = 0; k < 3*c+1; k++)
                System.out.print("*");

            System.out.println();
            System.out.println();
        }
    }
}