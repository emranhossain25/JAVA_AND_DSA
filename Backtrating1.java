public class Backtrating1 {
    public static void printPermutation(String str,int idk,String permu){
        if (str.length()==0){
            System.out.println(permu);
            return;
        }

        for (int i=0; i<str.length();i++){
            char currChar = str.charAt(i);
            String newsStr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newsStr,idk+1,permu+currChar);
        }
    }
    public static void main(String args[]){
        String str = "ABC";
        printPermutation(str,0,"");
    }
}
