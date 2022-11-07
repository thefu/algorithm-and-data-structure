import java.util.Stack;

public class IsPopOrder {
    public boolean isPopOrder(int[] pushA, int[] popA){
        if (pushA == null || popA == null){
            return false;
        }

        Stack<Integer> stack = new Stack<>();

        int index = 0;

        for(int i = 0; i < pushA.length; i++){
            stack.push(pushA[i]);

            while ((!stack.isEmpty()) && stack.pop() == popA[index]){
                stack.pop();
                index++;
            }
        }

        return stack.isEmpty();
    }

}
