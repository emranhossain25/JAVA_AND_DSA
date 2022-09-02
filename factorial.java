import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float num,fact=1;
        System.out.println("Enter any number");
        num=sc.nextFloat();
        for (int i=1;i<=num;i++)
        {
            fact=fact * i;
        }
        System.out.println("FACTORIAL OF "+num+" is" +fact);
    }
}
