package hashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China",150);
        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);
        // Searching
        if(map.containsKey("Indonesia")){
            System.out.println("key is the present in map");
        }else{
            System.out.println("Key is not present in the map");
        }
        System.out.println("China");
        System.out.println("Indonesia");
        // 1st Iteration using for loop
//       int arr[] = {12,15,18};
//        for(int i = 0; i<3; i++){
//             System.out.print(arr[i]+ " ");
//            System.out.println();
//            for(int val : arr){
//                System.out.println(val+" ");
//            }
//            System.out.println();
//        }

        // Iteration 2
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }
        // Iteration 3
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}
