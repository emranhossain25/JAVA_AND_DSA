import java.util.Scanner;
public class fibonaccinumber {
    static int fib(int num) {
        if (num == 1 || num == 2) {
            return num - 1;
        } else {
            return fib(num - 1) + fib(num - 2);
        }
    }

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number which you want fibonacci");
        int num = sc.nextInt();
        int result = fib(num);
        System.out.println("FIBONICCI=" + result);
    }
}
