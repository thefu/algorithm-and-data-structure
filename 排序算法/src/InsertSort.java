import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{10,30,50,20,40,90,60};

        System.out.println(Arrays.toString(sort2(arrays,arrays.length)));
    }

    public static int[] sort(int[] arrays, int n){
        int i ,j, k;
        for(i = 1; i < n; i++){
            for(j = i-1; j >=0; j--){
                if (arrays[j] < arrays[i]){
                    break;
                }
            }
            if(j != i-1){
                int temp = arrays[i];

                for(k = i-1; k > j; k--){
                    arrays[k+1] = arrays[k];
                }
                arrays[k+1] = temp;
            }
        }

        return arrays;
    }

    public static int[] sort2(int[] arrays, int n){
        for(int i = 1; i < n; i++){
            for(int j = i; j >= 1; j--){
                if (arrays[j] < arrays[j-1]){
                    int temp = 0;
                    temp = arrays[j];
                    arrays[j] = arrays[j-1];
                    arrays[j-1] = temp;
                }else {
                    break;
                }
            }
        }
        return arrays;
    }

}
