import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int n = scanner.nextInt ();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt ();
        }
        System.out.println ( modyfiCount ( n,nums ) );

    }

    private static int modyfiCount(int n, int[] nums){
        int i = 0;
        int flag = 0;
        while(i < n-1){
            if(nums[i] > nums[i+1]){
                i++;
                continue;
            }else{
                while (nums[i] <= nums[i+1]){
                    nums[i+1] = nums[i+1] - 1;
                }
                i++;
                flag = flag + 1;
                continue;
            }
        }
        return flag;
    }
}
