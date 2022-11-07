import java.rmi.MarshalException;
import java.util.Arrays;

/**
 * 抢劫一排住户，但是不能抢邻近的住户，求最大抢劫量。
 */
public class Rob {

    public static void main(String[] args) {

        int[] nums = new int[]{2,7,9,3,1};
        System.out.println(rob(nums));

    }

    public static int rob(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        int length = nums.length;

        int[] dp = new int[length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i < length+1; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }

        return dp[length];
    }
}
