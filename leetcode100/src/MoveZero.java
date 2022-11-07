/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class MoveZero {

    public void moveZeros(int nums[]){
        if (nums.length == 0) {
            return;
        }
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if (nums[j] != 0){
                nums[i++] = nums[j];
            }
        }
        for (int j = i; j < nums.length; j++){ //由于在前面将i进行过自增操作，所以这里不加1
            nums[j] = 0;
        }
    }

}
