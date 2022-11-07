import java.util.HashMap;
import java.util.Map;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class ClimbStairs {

    private Map<Integer, Integer> storeMap = new HashMap<>();


    public int climbStairs1(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (null != storeMap.get(n)){
            return storeMap.get(n);
        } else {
            int result = climbStairs1(n - 1) + climbStairs1(n - 2);
            storeMap.put(n,result);
            return result;
        }
    }

    //这种解法维护了一个哈希表，在递归的时候，如果遇到在哈希数组中没有的值，则保存在表中，方便其他递归到该数字的时候获取，也就不需要再递归一遍，这样使得整体的时间复杂度从O(2^n)变为O(n)


    public int climbStairs2(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int result = 0;
        int pre = 2;
        int prePre = 1;
        for (int i = 3; i < n; i++){
            result = pre + prePre;
            prePre = pre;
            pre = result;
        }
        return result;
    }

    //这种解法是循环的解法，自底向上的累加
}
