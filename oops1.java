import java.util.Scanner;
import java.util.Random;
import java.util.*;

class Game1{

    public int noOFguess;
    public int userInput;
    public int compINPUT;

    //Using get setter methods
    public int getNoOFguess(){
        return noOFguess;
    }

    public void setNoOFguess(){
        this.noOFguess=noOFguess;
    }

    //using contrustor

    Game1(){
        Random rand = new Random();
        this.compINPUT=rand.nextInt(100);
    }

    public void takeUSERinput(){
        System.out.println("GUESS THE CORRECT NUMBER");
        Scanner sc = new Scanner(System.in);
        this.userInput= sc.nextInt();
    }

    public boolean isCORRECTNUMBER(){
        noOFguess++;
        if (compINPUT==userInput){
            System.out.format("Yes ! You guess it right..,it was  %d\n You gussed i in %d attemps",userInput,noOFguess);
            return true;
        }

        else if (compINPUT>userInput){
            System.out.println("TOO LOW ...");
        }

        else if (compINPUT<userInput){
            System.out.println("TOO HIGH....");
        }

        return false;
    }
}

public class oops1 {
    public static void main(String args[]){
        Game1 g = new Game1();
        boolean b = false;
        while (!b){
            g.takeUSERinput();
            b= g.isCORRECTNUMBER();
        }
    }
}
