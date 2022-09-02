import java.util.*;

public class hashset {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
// hashset does not allow duplicate
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);

//        //search in hashset
//        if (set.contains(2)){
//            System.out.println("2 present in hashset");
//        }
//        if (!set.contains(2)){
//            System.out.println("2 is not present in hashset");
//        }
        //size in hashset
//        System.out.println(set.size());
//        // delete in hashset
//        set.remove(2);
//        if (!set.contains(2)){
//            System.out.println("2 is deleted");
//        }
//        //iterator in hashset
//        Iterator it = set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next() + " ");
//        }
        //if set is empty
        if (!set.isEmpty()){
            System.out.println("set is not empty");
        }
    }
}
