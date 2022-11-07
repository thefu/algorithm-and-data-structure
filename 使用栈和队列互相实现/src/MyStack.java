import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queue;

    public MyStack(){
        queue = new LinkedList <> (  );
    }

    public void push(int num){
        queue.add ( num );
        int count = queue.size ();
        while (count-- > 1){
            queue.add ( queue.poll () );
        }
    }

    public int pop(){
        return queue.remove ();
    }

    public int top(){
        return queue.peek ();
    }

    public boolean isEmpty(){
        return queue.isEmpty ();
    }
}
