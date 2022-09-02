import java.util.ArrayList;

public class Recursion3 {
    public static void printPERMUTATION(String str,int idk,String pertumutation){
        if (str.length()==0){
            System.out.println(pertumutation);
            return;
        }
        for (int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newSTRING = str.substring(0,i) + str.substring(i+1);
            printPERMUTATION(newSTRING,idk+1,pertumutation+curr);
        }
    }
    //time complexity = O(n!)

  /*  public static int countpath(int i,int j,int m, int n){
        if (i==m-1 || j==n-1){
            return  1;
        }
        return countpath(i+1,j,m,n) + countpath(i,j+1,m,n);
    }*/


  /*  public static  int placetiles(int n,int m){
        if (n<m){
            return 1;
        }

        if (n==m){
            return  2;
        }

        return placetiles(n-1,m) + placetiles(n-m,m);
    }*/
/*
    public static int pairFRIENDS(int n){
        if (n<=1){
            return 1;
        }

        return pairFRIENDS(n-1) + (n-1)*pairFRIENDS(n-2);
    }*/

    public static  void printSubsets(ArrayList<Integer>subset){
        for (int i=0; i<subset.size();i++){
            System.out.println(subset.get(i)+"");
            return;
        }
        System.out.println();
    }

    public static void findSubset(int n,ArrayList<Integer>subset){
        if (n==0){
            printSubsets(subset);
            return;
        }

        findSubset(n-1,subset);
        subset.add(n);
        findSubset(n-1,subset);
        subset.remove(subset.size() -1);
    }
    public static void main(String args[]){
     /*   String str = "abc";
        printPERMUTATION(str,0,"");*/

      /*  int m=4,n=4;
        System.out.println(countpath(0,0,m,n));*/
     /*   int n=4;
        int m=5;
        System.out.println(placetiles(n,m));*/
/*
        int n=4;
        System.out.println(pairFRIENDS(n));*/
        int n=3;
        findSubset(n,new ArrayList<Integer>());
    }
}
