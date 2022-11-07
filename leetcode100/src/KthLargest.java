import java.util.PriorityQueue;

/**
 * 设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。
 *
 * 请实现 KthLarget类：
 *
 * KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。
 * int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/kth-largest-element-in-a-stream
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class KthLargest {

    final PriorityQueue<Integer> queue;
    final int k;

    public KthLargest(int[] a, int k) {
        queue = new PriorityQueue<>(k);
        this.k = k;
        for (int n : a){
            add(n);
        }
    }

    public int add(int val){
        if (queue.size() < k) {
            queue.offer(val);
        }else if (queue.peek() < val){
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }
}

/**
 * 题目解法：
 * 维护一个大小为k优先队列，（优先队列的解释是正常进入，按照优先级出，有两种实现机制，一种是heap，一种是二叉搜索树的形式呈现）
 * 判断哪些数据需要进入，即该队列是否还未填满，在判断该数据是否大于该队列中的最小数，进行添加，最后返回最小的数据，即为该数组中的第k大的数字
 */
