package program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        // to get an element
        int element =  list.get(0);
        System.out.println(element);
        // add element in bt
        list.add(1,2);
        System.out.println(list);
        // set element
        list.set(1,2);
        System.out.println(list);
        //delete element
        list.remove(2);
        System.out.println(list);
        // size of list
        int size =  list.size();
        System.out.println(size);
        // loops on list
        for(int i =0; i<list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        //sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);

    }
}
