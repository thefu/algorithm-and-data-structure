import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个由数字和运算符组成的字符串 expression ，按不同优先级组合数字和运算符，计算并返回所有可能组合的结果。你可以 按任意顺序 返回答案。
 */
class DiffWaysToCompute {
    public static void main(String[] args) {
        DiffWaysToCompute diffWaysToCompute = new DiffWaysToCompute();
        String expression = "2-1-1";

        System.out.println(diffWaysToCompute.diffWaysToCompute(expression));
    }
    public List<Integer> diffWaysToCompute(String expression) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*'){//出现运算符号，就分成两部分，用递归去求解前半部分和后半部分
                List<Integer> left = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1,expression.length()));

                for(int l : left){
                    for(int r : right){
                        switch(c) {
                            case '+':
                                result.add(l+r);
                                break;

                            case '-':
                                result.add(l-r);
                                break;

                            case '*':
                                result.add(l * r);
                                break;
                        }
                    }
                }

            }
        }

        if(result.size() == 0)
            result.add(Integer.valueOf(expression));

        return result;


    }
}