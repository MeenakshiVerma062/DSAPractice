package program;

//import java.util.Stack;
//
//public class ReverseStack {
//    public static void pushBottom(Stack<Integer> s, int data){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int temp = s.pop();
//        pushBottom(s,data);
//        s.push(temp);
//    }
//    public static void reverse(Stack<Integer> s){
//        if(s.isEmpty()){
//            return;
//        }
//        int top = s.pop();
//        reverse(s);
//        pushBottom(s,top);
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());
//
//        }
//    }
//}
