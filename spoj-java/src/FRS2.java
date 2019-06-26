import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class FRS2 {
    static double phi = (1 + Math.sqrt(5)) / 2;
    static BigDecimal sqrt5 = new BigDecimal(Math.sqrt(5));
    static BigDecimal mod = new BigDecimal(1000000007);
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            int q = in.nextInt();
            while(q-- > 0) {
                int n = in.nextInt();
                System.out.println(fib(fib(n)));
            }
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Threw exception");
            return;
        }
    }

    static int fib(int n) {
        BigDecimal bd = new BigDecimal(phi);
        bd = bd.pow(n);
        bd = bd.divide(sqrt5, 0, RoundingMode.HALF_UP);
        return bd.remainder(mod).intValue();
    }
}