package program;

public class LearnQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("overflow");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        // Dequeue || O(n)

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            if(rear == -1){
                rear = -1;
            }
            return front;
        }

        //peek || O(n)n
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }

    }
        public static void main(String[] args) {
            Queue q = new Queue(3);
            q.add(1);
            q.add(2);
            q.add(3);
          //  q.add(4);
            while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        }
    }

