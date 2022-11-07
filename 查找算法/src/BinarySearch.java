/**
 * 二分查找算法
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(search(array,7));

    }

    public static int search(int[] array, int value){
        int left = 0;
        int right = array.length-1;

        while(left <= right){
            int mid = (left+right)/2;

            if (array[mid] == value){
                return mid;
            }else if (array[mid] > value){
                right = mid - 1;
            }else {
                left = mid + 1;
            }

        }

        return -1;


    }
}
