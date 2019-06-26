import java.util.Scanner;

class SMPDIV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            for(int i = x; i < n; i+=x) {
                if(i % y != 0)
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}