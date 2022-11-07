import java.util.Stack;

public class MyQueue {
    private Stack<Integer> inStack = new Stack <> ();
    private Stack<Integer> outStack = new Stack <> ();

    public void push(Integer num){
        inStack.push ( num );
    }

    public int pop(){
        in2out ();
        return outStack.pop ();
    }

    public int peek(){
        in2out ();
        return outStack.peek ();
    }

    private void in2out(){
        if (outStack.isEmpty ()){
            while (!inStack.isEmpty ()){
                outStack.push ( inStack.pop () );
            }
        }
    }
    public boolean empty(){
        return inStack.isEmpty () && outStack.isEmpty ();
    }
}
