import java.util.ArrayList;

public class Main4 {
    public int playNun(int n, int m){
        ArrayList list = new ArrayList (  );
        for(int i = 1; i < m; i++){
            list.add ( i );
        }
        while(list.size () > 1){
            int next = m - list.size ();
            list.remove ( next );
        }
        int res = (int) list.get ( 0 );

        return res;
    }
}
