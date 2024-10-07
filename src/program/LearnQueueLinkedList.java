package program;

public class LearnQueueLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                tail = head = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front = head.data;
            //single node
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
