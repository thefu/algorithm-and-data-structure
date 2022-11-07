public class cutRope {
    public static int cutRope(int length){
        if (length <=1 ){
            return 0;
        }
        if (length == 2){
            return 1;
        }
        if (length == 3){
            return 2;
        }
        int[] dp = new int[length + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= length; i++){
            int ret = 0;
            for (int j = 1; j <= i/2; j++){
                ret = Math.max(ret,dp[j] * dp[i-j]);
            }
            dp[i] = ret;
        }
        return dp[length];
    }

    public static void main(String[] args) {
        int num = 10;
        int res = cutRope(num);
        System.out.println(res);
    }

}
