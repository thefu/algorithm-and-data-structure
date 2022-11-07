import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ADD{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> array = new ArrayList<>();
            for(int j = 0; j < n; j++){
                int x = sc.nextInt();
                array.add(x);
            }
            list.add(array);
        }

        int[] nums = getList(n,list);
        for(int i : nums){
            System.out.println(i);
        }


    }

    public static int[] getList(int n, List<List<Integer>> list){
        boolean[] blnums = new boolean[n+1];
        int[] result = new int[n];
        for(int i = 0; i < n;i++){
            List nums = list.get(i);
            for(int j = 0; j < n; j++){
                if(blnums[(int) nums.get(j)] == false){
                    result[i] = (int) nums.get(j);
                    blnums[(int) nums.get(j)] = true;
                    break;
                }
            }
        }
        return result;
    }
}