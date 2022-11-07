public class ArrayStack {

    /**
     * 栈的大小
     */
    private int maxStack;

    /**
     * 数据模拟栈
     */
    private int[] stack;

    /**
     * 表示栈顶的位置，默认情况下如果没有数据时，使用-1
     */
    private int top = -1;

    public ArrayStack(int maxStack){
        this.maxStack = maxStack;
        stack = new int[maxStack];
    }

    /**
     * 1.压栈
     * 2.弹栈
     * 3.判断栈中是否有元素
     * 4.判断栈中是否满栈
     */

    /**
     * 判断栈中是否满栈
     */
    public boolean isFull(){
        return this.top == this.maxStack - 1;
    }

    /**
     * 判断栈中是否有元素
     */
    public boolean isEmpty(){
        return this.top == -1;
    }

    /**
     * 压栈
     */
    public void push(int value){
        //是否栈满
        if(isFull()){
            throw new RuntimeException("此栈已满!");
        }

        top++;

        stack[top] = value;
    }

    /**
     * 弹栈
     */
    public int pop(){
        //栈是否为空
        if(isEmpty()){
            throw new RuntimeException("此栈已空！");
        }

        int value = stack[top];

        top--;

        return value;


    }

    /**
     * 查看栈中所有元素
     */
    public void list(){
        //栈是否为空
        if(isEmpty()){
            throw new RuntimeException("空栈，未找到数据！");
        }
        for(int i = 0; i< stack.length; i++){
            System.out.printf("stack[%d] = %d\n", i, stack[i]);
        }
    }


}
