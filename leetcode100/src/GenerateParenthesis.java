import java.util.ArrayList;
import java.util.List;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合
 */
public class GenerateParenthesis {
    public List <String> generateParenthesis(int n) {
        List<String> result = new ArrayList <> (  );
        backtracking(n, result, 0, 0, "" );
        return result;
    }
    public static void backtracking(int n, List<String> arr, int left, int right, String str){
        if(right > left){
            return;
        }
        if(right == left && right == n){
            arr.add(str);
            return;
        }
        if(left < n){
            backtracking(n, arr, left+1, right, str+"(");
        }
        if(right < left){
            backtracking(n, arr, left, right+1, str+")");
        }
    }
}
