import java.util.Scanner;

public class SMPSEQ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] f = new int[n];
        for(int i = 0; i < n; i++) {
            f[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] s = new int[m];

        for(int i = 0; i < m; i++) {
            s[i] = in.nextInt();
        }

        for(int i = 0; i < n && i < m; i++) {
            if(f[i] == s[i])
                System.out.print(i + 1 + " ");
        }
    }
}
