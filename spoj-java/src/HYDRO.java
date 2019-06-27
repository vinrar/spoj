import java.util.Scanner;

//Trapping Rainwater Problem
public class HYDRO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];
            int front[] = new int[n];
            int back[] = new int[n];

            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if(arr[i] > max) {
                    max = arr[i];
                }
                front[i] = max;
            }

            max = Integer.MIN_VALUE;

            for(int i = n - 1; i >= 0; i--) {
                if(arr[i] > max) {
                    max = arr[i];
                }
                back[i] = max;
            }

            long out = 0;
            for(int i = 0; i < n; i++) {
                out += Math.min(front[i], back[i]) - arr[i];
            }
            System.out.println(out);
        }
    }
}
