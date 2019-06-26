import java.util.Scanner;

public class REPROAD {
    private static final Character zero = '0';

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-- > 0) {
            int n = in.nextInt();
            int cost = in.nextInt();
            char[] bs = new char[n];

            for(int i = 0; i < n; i++) {
                bs[i] = in.next().toCharArray()[0];
            }

            System.out.println(calculateCost(bs, cost, 0, 0));
        }
    }

    private static int calculateCost(char[] bs, int cost, int index, int valueSoFar) {
        if(index == bs.length)
            return valueSoFar;

        if(zero.equals(bs[index])) {
            if(cost == 0)
                return valueSoFar;
            return Math.max(calculateCost(bs, cost -1, index + 1, valueSoFar + 1),
                    calculateCost(bs, cost, index + 1, 0));
        } else {
            return calculateCost(bs, cost, index + 1, valueSoFar + 1);
        }
    }
}