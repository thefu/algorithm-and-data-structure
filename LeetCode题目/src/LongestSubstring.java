import java.util.HashSet;

//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet set = new HashSet();
        int n = s.length();
        int rk = 0;
        int res = 0;
        for(int i = 0; i < n; i++){
            if(i != 0){
                set.remove(s.charAt(i-1));
            }
            while(rk < n && !set.contains(s.charAt(rk))){
                set.add(s.charAt(rk));
                rk = rk + 1;
            }
            res = Math.max(res, set.size());
        }
        return res;


    }
}
