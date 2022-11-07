/**
 * 插值查找
 */
public class InsertSearch {
    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6,7,8,9};

        System.out.println(search(array,0,array.length-1,7));

    }

    public static int search(int[] array, int left, int right, int searchValue){

        /**
         * 防止数组越界
         */
        if (left>right || searchValue<array[0] || searchValue>array[array.length-1]){
            return -1;
        }

        int mid =left + (right-left)*(searchValue-array[left])/(array[right]-array[left]);

        if(array[mid] > searchValue){

            return search(array,left,right-1,searchValue);
        }else if(array[mid] < searchValue){
            return search(array,mid + 1, right,searchValue);
        }else {
            return mid;
        }
    }
}
