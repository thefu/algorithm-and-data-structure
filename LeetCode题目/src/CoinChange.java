/**
 * 零钱兑换，
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 *
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回-1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/coin-change
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CoinChange {
        int res = Integer.MAX_VALUE;
        public int coinChange(int[] coins, int amount) {
            if(coins.length == 0){
                return -1;
            }

            findWay(coins,amount,0);

            // 如果没有任何一种硬币组合能组成总金额，返回 -1。
            if(res == Integer.MAX_VALUE){
                return -1;
            }
            return res;
        }

        public void findWay(int[] coins,int amount,int count){
            if(amount < 0){
                return;
            }
            if(amount == 0){
                res = Math.min(res,count);
            }

            for(int i = 0;i < coins.length;i++){
                findWay(coins,amount-coins[i],count+1);
            }
        }
}
