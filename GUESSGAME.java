import java.util.Scanner;
import java.util.Random;
class  Game{
    public  int cominput;
    public  int inputnumber;
    public  int noOFguesses=0;
    public  int getNoOFguesses(){
        return  noOFguesses;
    }
    public  void setNoOFguesses(int noOFguesses){
        this.noOFguesses=noOFguesses;
    }
    Game(){
        Random rand = new Random();
        this.cominput = rand.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("GUESS THE NUMBER");
        Scanner sc = new Scanner(System.in);
        inputnumber= sc.nextInt();
    }
    boolean iscorrectnumber(){
        noOFguesses++;
        if (inputnumber==cominput){
            System.out.println("Yes you guess it right");
            return  true;
        }
        else if (inputnumber<cominput){
            System.out.println("TOO HIGH..........");
        }
        else if (inputnumber>cominput){
            System.out.println("TOO LOW......");
        }
        return  false;
    }
}
public class GUESSGAME {
    public static void main(String[] args){
        Game g = new Game();
        boolean b= false;
        while (!b){
            g.takeuserinput();
            b= g.iscorrectnumber();
        }
    }
}
