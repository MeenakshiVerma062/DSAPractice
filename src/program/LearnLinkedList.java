package program;

import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3,"linked");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
