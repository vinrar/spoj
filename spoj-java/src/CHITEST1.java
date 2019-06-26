import java.util.Scanner;

public class CHITEST1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-- > 0) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double sum = a + b;
            if((int) sum == sum) {
                System.out.println((int)sum);
            } else {
                System.out.println(sum);
            }
        }
    }
}
