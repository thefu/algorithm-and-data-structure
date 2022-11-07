/**
 * 给你两个按 非递减顺序 排列的整数数组nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Merge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = n + m;
        int[] temp = new int[k];
        for(int index = 0, indexnums1 = 0, indexnums2 = 0; index < k; index++) {
            if(indexnums1 >= m){//nums1的数组已经取完了，完全取nums2数组的值就可以了
                temp[index] = nums2[indexnums2++];
            }else if(indexnums2 >= n) {//nums2的数组已经取完了，完全取nums1的数组的值就可以了
                temp[index] = nums1[indexnums1++];
            }else if(nums1[indexnums1] < nums2[indexnums2]){//nums1数组元素值小于nums2数组元素的值，取nums1元素的值
                temp[index] = nums1[indexnums1++];
            }else{//nums2元素的值小于等于nums1元素的值，取nums2元素的值
                temp[index] = nums2[indexnums2++];
            }
        }
        for(int i = 0; i < k; i++){
            nums1[i] = temp[i];
        }
    }

}
