import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostPopularCreator {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        HashMap map = new HashMap();
        for(int i = 0; i < creators.length; i++){
            map.put(creators[i], (int)map.get(creators[i]) + views[i]);
        }

        int max = 0;
        for (Object key : map.keySet()) {
            int value = (int)map.get(key);
        }
        List list =new ArrayList<>();
        return list;
    }


}
