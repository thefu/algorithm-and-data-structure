import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 字母移位词分组
 */
public class GroupAnagrams {
    public List<List <String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList> result = new HashMap <> ();
        for(String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            if(!result.containsKey (key)){
                result.put(key,new ArrayList<>());
            }
            result.get(key).add(s);
        }

        return new ArrayList(result.values());
    }
}
