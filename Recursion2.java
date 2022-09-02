import javax.print.attribute.HashAttributeSet;
import java.util.HashSet;

public class Recursion2 {

    //time complexity = O(2^n)
    //tower of hanoi problem
 /*   public static void towerofhanoi(int n, String source,String helper,String disk){
        if (n==1){
            System.out.println("transfer disk from"+ n + "from" +source+ "to" +disk);
            return;
        }
        towerofhanoi(n-1,source,disk,helper);
        System.out.println("transfer disk" + n + "from" +source+ "to" +disk);
        towerofhanoi(n-1,helper,source,disk);
    }
//time complexity = O(n)
    public static void reverse(String str,int idk){
        if (idk==0){
            System.out.println(str.charAt(idk));
            return;
        }
        System.out.print(str.charAt(idk));
        reverse(str,idk-1);
    }
    */
//timé complexity = O(n)
 /*   public static  int first = -1;
    public static  int last = -1;
    public static void getIndices(String str,char el, int idk){
        if (idk==str.length()){
            return;
        }

        if (str.charAt(idk) == el){
            if (first == -1){
                first = idk;
            }
            else {
                last = idk;
            }
        }

        getIndices(str,el,idk);
    }*/
// time complexity = O(n)
    /*public static boolean isSortedArray(int arr[], int idk){
        if (idk==arr.length-1){
            return true;
        }
        if (arr[idk]<arr[idk+1]){
            return isSortedArray(arr,idk+1);
        }
        else {
            return false;
        }
    }
public static String removeduplicate(String str,int idk,boolean present[]){
    if (idk == str.length()){
        return "";
    }
    char curr = str.charAt(idk);
    if (present[curr - 'a']){
        return removeduplicate(str,idk+1,present);
    }
    else {
        present[curr - 'a'] = true;
        return removeduplicate(str,idk+1,present);
    }
}*/
//time complexity = O(2^n)
  /*  public static void subsequemce(String str,int idk,String newstring){

        if (idk==str.length()){
            System.out.println(newstring);
            return;
        }
        char curr = str.charAt(idk);
        subsequemce(str,idk+1,newstring+curr);
        subsequemce(str,idk+1,newstring);
    }*/
   /* public static void subsequemce(String str, int idk, String newstring, HashSet<String>ser){

        if (idk==str.length()){
           if ()
        }
        char curr = str.charAt(idk);
        subsequemce(str,idk+1,newstring+curr);
        subsequemce(str,idk+1,newstring);
    }*/

    //print keypord
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printcombo(String str,int idk,String combination){
        if (idk==str.length()){
            System.out.println(combination);
            return;
        }

        char curr = str.charAt(idk);
        String mapping = keypad[curr-'0'];
        for (int i=0; i<mapping.length();i++){
            printcombo(str,idk+1,combination+mapping.charAt(i));
        }
    }

    public static void main(String args[]){
       // int n=5;
      /*  //towerofhanoi(n,"A","B","C");
        String str = "abcde";
        reverse(str,str.length()-1);
        String str = "tabsnbakkk";
        char el = 'a';
        getIndices(str,el,0);
        System.out.println("First Occurence: " +first );
        System.out.println("Last Occurernce: " +last);*/
       /* int arr[] = {1,3,3,5};
        System.out.println(isSortedArray(arr,0));

        String str = "aaaaaaaaanbbbbbbnnncccdddee";
        boolean present[] = new boolean[str.length()];
        System.out.println(removeduplicate(str,0,present));*/

     /*   String str = "abc";
        subsequemce(str,0,"");*/

        String str = "23";
        printcombo(str,0,"");
    }
}
