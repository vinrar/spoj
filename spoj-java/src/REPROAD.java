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
            int[][] dp = new int[n][cost + 1];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j <= cost; j++) {
                    dp[i][j] = -1;
                }
            }

            System.out.println(calculateCost(bs, cost, cost,0, 0, dp));
        }
    }

    private static int calculateCost(char[] bs, int cost, int totalCost, int index, int valueSoFar, int[][] dp) {
        if(index == bs.length)
            return valueSoFar;

        if(zero.equals(bs[index])) {
            if(cost == 0)
                return valueSoFar;

            if(dp[index][cost] != -1)
                return dp[index][cost];

            dp[index][cost] = Math.max(calculateCost(bs, cost -1, totalCost, index + 1, valueSoFar + 1, dp),
                    calculateCost(bs, totalCost, totalCost, index + 1, 0, dp));
            return dp[index][cost];
        } else {
            if(dp[index][cost] != -1)
                return dp[index][cost];

            dp[index][cost] = calculateCost(bs, cost, totalCost, index + 1, valueSoFar + 1, dp);
            return dp[index][cost];
        }
    }
}