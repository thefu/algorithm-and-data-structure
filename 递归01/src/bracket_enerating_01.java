import java.util.List;

public class bracket_enerating_01 {
    public List <String> generateParenthesis(int n) {
        _generate(0, 2*n, "");
        return null;
    }

    private void _generate(int level, int max, String s) {
        // terminator
        if (level >= max){
            System.out.println ( s );
            return;
        }
        // process
        String s1 = s + "(";
        String s2 = s + ")";

        // drill down
        _generate ( level+1, max, s1 );
        _generate ( level+1, max, s2 );

        //reverse states
    }

    public static void main(String[] args) {
        bracket_enerating_01 be = new bracket_enerating_01 ();
        System.out.println ( be.generateParenthesis ( 3 ) );
    }
}
