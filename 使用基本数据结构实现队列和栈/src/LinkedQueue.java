public class LinkedQueue {
    public class Node{
        private String value;
        private Node next;
        public Node(String value,Node node){
            this.value=value;
            this.next=node;
        }
    }

    /**
     * 队列的队首和队尾
     */
    private Node head=null;
    private Node tail=null;

    /**
     * 入队
     * @param value
     */
    public void enqueue(String value){
        Node newNode=new Node(value,null);
        if(tail==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=tail.next;
        }
    }

    /**
     * 出队
     * @return
     */
    public String dequeue(){
        if(head==null){
            return null;
        }
        String value = head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        return value;
    }

    public static void main(String[] args) {
        LinkedQueue linkedQueue=new LinkedQueue();
        linkedQueue.enqueue("a");
        linkedQueue.enqueue("b");
        linkedQueue.enqueue("c");
        System.out.println ( linkedQueue.dequeue() );
        System.out.println ( linkedQueue.dequeue() );
    }


}
