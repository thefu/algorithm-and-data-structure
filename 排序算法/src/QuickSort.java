import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{2,3,7,8,6,5};
        sort(arrays,0,arrays.length-1);
        System.out.println(Arrays.toString(arrays));
    }

    public static void sort(int[] arrays, int left, int right){
        int l = left;
        int r = right;

        int x = arrays[l];

        while(l < r){
            while(l < r && arrays[r] > x){
                r--;
            }
            if (l < r){
                arrays[l++] = arrays[r];
            }

            while(l < r && arrays[l] < x){
                l++;
            }
            if (l < r){
                arrays[r--] = arrays[l];
            }
            arrays[l] = x;
            sort(arrays, left,l-1);
            sort(arrays, l+1, right);
        }
    }
}
