public class ArrayQueue {

    //定义数组，数组的大小，两个指针（头和尾）
    //定义这个类带参数的构造函数，参数是数组的大小
    //队列的添加操作，先要判断尾指针的位置，如果尾指针为数组的大小了的话，则不能添加数据
    //      在数组的尾指针出放上数据，并将尾指针加1

    //数组
    private String[] items;
    //数组大小n
    private int n = 0;
    //head表示队头下标 tail表示队尾下标
    private int head = 0;
    private int tail = 0;

    //定义构造方法
    public ArrayQueue(int length){
        items = new String[length];
        n = length;
    }

    //定义这个队列的入队操作
    public void push(String item){
        if (tail == n){
            return;
        }
        items[tail] = item;
        tail++;
    }

    //定义这个队列的出队操作
    public String pop(){
        if (head == tail){
            return null;
        }
        String res = items[head];
        head++;
        return res;
    }


}
