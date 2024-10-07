package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class LearnHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        //Search-Contains
        if(set.contains(1)){
            System.out.println("set contains");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain - we delete");
        }
        // size
        System.out.println("size of set is "+set.size());
        // print all element
        System.out.println(set);
        // Iterator
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.print(" " +it.next());
        }
    }
}
