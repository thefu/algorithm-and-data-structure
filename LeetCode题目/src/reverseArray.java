public class reverseArray {
    public static int minNumberInRotateArray(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int mid = (left+right)/2;
            if (array[mid] > array[right]){
                left = mid + 1;

            }else if (array[mid] == array[right]){
                right = right-1;
            }else {
                right = mid;
            }
        }
        return array[right];
    }

    public static void main(String[] args) {
        int[] array = {5,1,2,3,4};
        int res = minNumberInRotateArray(array);
        System.out.println(res);
    }
}
