/**
 * 母牛生产
 */
public class NewCow {

    public static void main(String[] args) {

        System.out.println(newCow(3));

    }

    public static int newCow(int i){


        int[] dp = new int[i+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int j = 3; j < dp.length; j++){
            dp[j] = dp[j-1] + dp[j-3];
        }

        return dp[i];
    }
}
