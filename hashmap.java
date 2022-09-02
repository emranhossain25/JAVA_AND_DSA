import java.util.*;

public class hashmap {
    public static void main(String args[]){
        HashMap<String,Integer>map = new HashMap<>();
        // insertion in map

        map.put("india",121);
        map.put("china",140);
        map.put("us",30);
        System.out.println(map);
//        map.put("china",200);
//        System.out.println(map);
//
//        //searching in map
//        if (map.containsKey("china")){
//            System.out.println("china is present is the map");
//        }
//        else {
//            System.out.println("china is not present in the map");
//        }
        //iteration in hashmap
      for (Map.Entry<String,Integer>e : map.entrySet()){
          System.out.println();
      }

    }
}
