import java.util.Scanner;
import java.util.Random;
public class ROCKPAPERSCCISOR {
    public static void main(String[] args){
        int count;
        int tiecount=0;
        int usercount=0;
        int  compcount=0;
        for ( count=0;count<10;count++)
        {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random(3);
            System.out.println("Enter 0 for ROCK, 1 for PAPER,2 for SCISSOR");
            usercount=sc.nextInt();
            compcount=rand.nextInt();

            if (usercount==0 && compcount==2 || usercount==1 && compcount==0 || usercount==2 && compcount==1)
            {
                System.out.println("user win");
                usercount++;
            }
            else if (usercount==compcount)
            {
                System.out.println("MATCH IS TIE");
                tiecount++;
            }
            else
            {
                System.out.println("COMPUTAR WIN");
                compcount++;
            }
             if (compcount==0)
        {
            System.out.println("COMPUTAR CHOSE ROCK");
        }
             else if (compcount==1)
             {
                 System.out.println("COMPUTAR CHOSE PAPER");
             }
             else if (compcount==2)
             {
                 System.out.println("COMPUTAR CHOSE SCISSOR");
             }
        }
        System.out.println();
        System.out.println("COMPUTAR WIN "+compcount+" times ");
        System.out.println("USER WIN "+usercount+" TIMES");
        System.out.println("TIE "+tiecount+"TIMES");
        }
}




