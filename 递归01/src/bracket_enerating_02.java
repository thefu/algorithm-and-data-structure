import java.util.ArrayList;
import java.util.List;

public class bracket_enerating_02 {

    private List<String> result;
    public List <String> generateParenthesis(int n) {
        result = new ArrayList <String> (  );
        _generate(0, 0, n,"");
        return result;
    }

    private void _generate(int left, int right, int n, String s) {
        // terminator
        if (left == n && right == n){
            result.add ( s );
            return;
        }
        // process
        String s1 = s + "(";
        String s2 = s + ")";

        // drill down
        if (left < n)
            _generate ( left+1, right, n, s1 );
        if (right < left)
            _generate ( left,right+1, n, s2 );

        //reverse states
    }

    public static void main(String[] args) {
        bracket_enerating_02 be = new bracket_enerating_02 ();
        System.out.println ( be.generateParenthesis ( 3 ) );
    }
}
