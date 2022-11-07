/**
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 *
 * 返回 滑动窗口中的最大值
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/sliding-window-maximum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        int max = 0;
        for(int i = 0; i < k; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        result[0] = max;
        for(int i = k; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
                result[i-k+1] = max;
            }
        }
        return result;
    }
}
