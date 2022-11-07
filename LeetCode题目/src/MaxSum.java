public class MaxSum {
    public static int maxSum(int[] nums){
        int len = nums.length;

        if (len == 0){
            return 0;
        }

        int[] dp = new int[len];
        dp[0] = nums[0];

        for (int i = 1; i < len; i++){
            dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
        }

        int res = 0;

        for (int i =1; i < len; i++){
            res = Math.max(res,dp[i]);
        }

        return  res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(nums));
    }
}
