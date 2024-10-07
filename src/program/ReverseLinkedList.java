package program;

public class ReverseLinkedList {
    Node head;
    private int size;
    ReverseLinkedList(){
        size = 0;
    }
    public class Node{
        int data;
        Node next;
        Node(int  data){
            this.data = data;
            this.next =  null;
            size++;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode= head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("Emply list, nolthing to delete");
            return;
        }
        head = this.head.next;
        size--;
    }
    public void removeLast(){
        if(head == null) {
            System.out.println("emplt list, nothing to delete");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
        size--;
    }

    public int getSize() {
        return size;
    }

    //Iterative method - time complexity -O(n) space- O(1)
    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            head.next = null;
        }
        head = prevNode;

    }
    //Recursive method time complexity = O(n), SC = O(1)
    public Node reverseListRecusive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseListRecusive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
//        list.reverseList();
//        list.printList();
        list.head = list.reverseListRecusive(list.head);
        list.printList();

      //  list.addFirst(4);
     //   list.printList();
//        System.out.println(list.getSize());
//        list.removeFirst();
//        list.printList();
//        list.removeLast();
//        list.printList();
    }
}
