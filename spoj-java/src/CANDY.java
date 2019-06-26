import java.util.Scanner;

public class CANDY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n != -1) {
            int[] arr = new int[n];
            long sum = 0L;
            long mid = 0L;
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                sum += arr[i];
            }

            if(sum % n == 0) {
                mid = sum / n;
                sum = 0;
                for(int i = 0; i < n; i++) {
                    if(arr[i] > mid) {
                        sum += arr[i] - mid;
                    }
                }
                System.out.println(sum);
            } else {
                System.out.println("-1");
            }

            n = in.nextInt();
        }
    }
}
