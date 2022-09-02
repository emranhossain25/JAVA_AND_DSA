
class Animal
{
 String voice;
 public  Animal(String voice)
 {
     System.out.println("I AM A ANIMAL");
     System.out.println("VOICE OF THE ANIMAL......"+voice);
 }
}
class  dog extends  Animal {
    public dog() {
        super("BARKS....");
        System.out.println("I AM A DOG");
    }
}

class  cat extends  Animal{
    public cat(){
        super("meows....");
        System.out.println("I AM A DOG");
    }
}
public class inheritance {
    public  static void main(String[] args){
     dog tommy = new dog();
     System.out.println();
     cat jenny =new cat();
    }
}
