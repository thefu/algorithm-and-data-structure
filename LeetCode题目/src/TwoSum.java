import java.util.Hashtable;

/**
 * 两数之和
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Hashtable<Integer, Integer> map = new Hashtable<> ();
        for(int i = 0; i < nums.length; i++){
            map.put (nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int dif = target - nums[i];
            if(map.containsKey(dif) && map.get ( dif ) != i){
                res[0] = i;
                res[1] = map.get(dif);
                return res;
            }
        }
        return res;
    }
}