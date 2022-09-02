public class permu {
    public static void printPermutation(String str,int idk,String permu){
        if (str.length()==0){
            System.out.println(permu);
        }
        for (int i=0;i<str.length();i++){
            char currCHAR = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newstr,idk+1,permu+currCHAR);
        }
    }
    public static void main(String args[]){
        String str = "ABC";
        printPermutation(str,0,"");
    }
}
