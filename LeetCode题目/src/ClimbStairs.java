/**
 * 爬楼梯
 */
public class ClimbStairs {



    public static void main(String[] args) {
        int n = 4;
        ClimbStairs climbStairs = new ClimbStairs();

        System.out.println(climbStairs.climbStairs(n));
    }



    public int climbStairs(int n) {
        if (n<=2) return n;
        int pre1 = 2, pre2 = 1;
        for (int i=2;i<n;i++) {
            int cur = pre1 + pre2;
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }

    public int climbStairs2(int n){
        if(n <= 2){
            return n;
        }else {
            return climbStairs(n-1) + climbStairs(n-2);
        }


    }
}
