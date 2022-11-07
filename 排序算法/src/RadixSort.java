import java.util.Arrays;

/**
 * 基数排序
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{53,542,3,63,14,214,154,748,616};
        sort(arrays);
    }

    public static void sort(int[] arrays){

        /**
         * 获取最大位数
         */
        int max = 0;
        for(int i = 0; i < arrays.length; i++){
            if(arrays[i] > max){
                max = arrays[i];
            }
        }

        /**
         * 获取字符串长度，把int类型转换成字符串类型
         */
        int maxLength = (max+"").length();

        /**
         * 定义二维数组，大小为10.表示10个桶，每一个桶则是一个数组
         */
        int[][] bucket =new int[10][arrays.length];

        /**
         * 定义一个辅助数组，用于记录每个桶子存放了多少个元素
         */
        int[] bucketElementCount = new int[10];

        /**
         * 循环获取无序序列
         */
        for(int j = 0; j < arrays.length; j++){
            int elementLocation = arrays[j]%10;

            /**
             * 放入桶中
             */
            bucket[elementLocation][bucketElementCount[elementLocation]] = arrays[j];
            bucketElementCount[elementLocation]++;

        }

        /**
         * 遍历每一个桶，将元素放回原来的数组,并将辅助数组置为0
         */
        int index = 0;
        for(int k = 0; k < bucketElementCount.length; k++){
            if(bucketElementCount[k] != 0){
                for(int l = 0; l < bucketElementCount[k]; l++){
                    arrays[index++] = bucket[k][l];
                }
                bucketElementCount[k] = 0;
            }
        }

        /**
         * 基于十位数的排序
         */

        for(int j = 0; j < arrays.length; j++){
            int elementLocation = arrays[j]/10%10;
            bucket[elementLocation][bucketElementCount[elementLocation]] = arrays[j];
            bucketElementCount[elementLocation]++;
        }

        index = 0;
        for(int k = 0; k < bucketElementCount.length; k++){
            if(bucketElementCount[k] != 0){
                for(int l = 0; l < bucketElementCount[k]; l++){
                    arrays[index++] = bucket[k][l];
                }
                bucketElementCount[k] = 0;
            }
        }

        /**
         * 基于百位数的排序
         */
        for(int j = 0; j < arrays.length; j++){
            int elementLocation = arrays[j]/100%10;
            bucket[elementLocation][bucketElementCount[elementLocation]] = arrays[j];
            bucketElementCount[elementLocation]++;
        }

        index = 0;
        for(int k = 0; k < bucketElementCount.length; k++){
            if(bucketElementCount[k] != 0){
                for(int l = 0; l < bucketElementCount[k]; l++){
                    arrays[index++] = bucket[k][l];
                }
                bucketElementCount[k] = 0;
            }
        }

        System.out.println(Arrays.toString(arrays));


    }
}
