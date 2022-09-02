public class Recursion1 {
    public static void printFactorial(int n,int fact){
        if (n==0){
            System.out.println(fact);
            return;
        }

        fact *=n;
        printFactorial(n-1,fact);
    }

    public static void fibonacci(int a,int b,int n){
        if (n==0){
            return;
        }

        System.out.println(a);
        fibonacci(b,a+b,n-1);
    }

// print x^n (stack height =n)
    public static  int calPower(int x, int n){
        if (n == 0){
            return 1;
        }
        if (x==0){
            return 0;
        }

        int x_ = calPower(x,n-1);
        int xn = x * x_ ;
        return xn;
    }

    // print x^n (stack height =log(n))
    public static int calPOWER(int x, int n){
        if (n==0){
            return 1;
        }

        if ( n % 2 ==0){
            return calPOWER(x,n/2) * calPOWER(x,n/2);
        }

        else {
            return x * calPOWER(x,n/2) * calPOWER(x,n/2);
        }
    }

// sum of natural number
    public static  void printSUM(int sum,int n){
        if (n==0){
            System.out.println(sum);
            return;
        }

        sum +=n;
        printSUM(sum,n-1);
    }
    public static void main(String args[]){
       /* printFactorial(5,1);
        fibonacci(0,1,5);*/

        /*int x = 2 , n = 5;
        //int ans = calPower(x,n);
        int ans2 = calPOWER(x,n);
        System.out.println(ans2);*/

        printSUM(0,5);
    }
}
