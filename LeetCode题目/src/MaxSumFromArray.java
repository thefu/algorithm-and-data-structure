/**
 * 求数组不相邻元素之和最大
 */
public class MaxSumFromArray {
    public static void main(String[] args) {
        int[] since = {1,2,3,4};
        System.out.println(getMax(since, since.length-1));
    }


    public static int getMax(int[] arr, int i) {
        if (i == 0) {
            return arr[0];
        } else if (i == 1) {
            int max = Math.max(arr[0], arr[1]);
            return max;
        } else {
            int a = getMax(arr, i - 2) + arr[i];
            int b = getMax(arr, i - 1);
            int max = Math.max(a, b);
            return max;
        }
    }
}
