/**
 * 信件错排
 * 题目描述: 有 N 个 信 和 信封，它们被打乱，求错误装信方式的数量。
 */
public class ErrorEmail {
    public static void main(String[] args) {

        System.out.println(errorEmail(3));

    }

    /**
     * 算法思想：
     *      当n个编号元素放在n个编号位置，元素编号与位置编号各不对应的方法数用dp[n]表示，那么dp[n-1]就表示n-1个编号元素放在n-1个编号位置，各不对应的方法数，其它类推.
     * 第一步，把第n个元素放在一个位置，比如位置k，一共有n-1种方法；
     * 第二步，放编号为k的元素，这时有两种情况：⑴把它放到位置n，那么，对于剩下的n-1个元素，由于第k个元素放到了位置n，剩下n-2个元素就有dp[n-2]种方法；
     * ⑵第k个元素不把它放到位置n，这时，对于这n-1个元素，有dp[n-1]种方法；
     * @param n
     * @return
     */
    public static int errorEmail(int n){

        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;

        for(int i = 3; i < dp.length; i++){
            dp[i] = (dp[i-1] + dp[i-2])*(i-1);
        }

        return dp[n];

    }
}
