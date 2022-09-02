import java.net.PortUnreachableException;
import java.util.Scanner;
class Accunt{
    private int accuntid;
    private String accuntTYPE;
    private int balence;
    public int getAccuntid()
    {
        return accuntid;
    }
    public String getAccuntTYPE()
    {
        return accuntTYPE;
    }
    public int getBalence()
    {
        return balence;
    }
    public void setAccuntid(int id)
    {
        this.accuntid=id;
    }
    public void setAccuntTYPE(String s)
    {
        this.accuntTYPE=s;
    }
    public void setBalence(int b)
    {
        this.balence=b;
    }
    public boolean withdraw(int w)
    {
        if (getBalence()<w)
        {
            System.out.println("Sorry! no enough balence");
            return false;
        }
        else {
            System.out.println("Balence Amount after withdrw");
            return true;
        }
    }
}
public class ACCUNT_CLASS {
    public static Accunt getAccontDetails()
    {
        Accunt acc=new Accunt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enrer account id");
        acc.setAccuntid(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter account type");
        acc.setAccuntTYPE(sc.nextLine());
        int b;
        do {
            System.out.println("Enter Balence");
            acc.setBalence(sc.nextInt());
            b=acc.getBalence();
            if (b<=0)
                System.out.println("Balence Should be possitive");
        }while (b<=0);
        return acc;
    }
    public static int getwithdrawAmount()
    {
        Scanner sc=new Scanner(System.in);
        int w;
        do {
            System.out.println("Enter amount to be wihdraw:");
            w= sc.nextInt();
            if (w<=0)
                System.out.println("Amount Should be positive");
        }while (w<=0);
        return w;
    }
    public static void main(String[] args) {
        Accunt obj=new Accunt();
        obj=getAccontDetails();
        int c=getwithdrawAmount();
        obj.withdraw(c);
    }
}
