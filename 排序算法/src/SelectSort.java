import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {

        int[] nums = new int[]{10,50,30,60,20,80};

        sort(nums,nums.length);

        System.out.println(Arrays.toString(nums));

    }

    public static void sort(int[] arrays, int n){
        for(int i = 0; i < arrays.length; i++){

            int x = i;
            int index = arrays[i];

            for(int j = i; j < arrays.length; j++){
                if(arrays[j] < index){
                    index = arrays[j];
                    x = j;
                }
            }

            int num = arrays[i];
            arrays[i] = arrays[x];
            arrays[x] = num;
        }
    }
}
