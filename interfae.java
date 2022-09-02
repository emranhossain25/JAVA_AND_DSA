interface Bycycle{
    int a=10;
    void  applybreak(int decrement);
    void  speedup(int increment);
}
interface Hornblow{
    void  blowhorn1();
    void  blowhorn2();
}
class  Avoncycle implements Bycycle,Hornblow{
    public  void blowhorn()
    {
        System.out.println("pee pee poo poo");
    }
    public void applybreak(int decrement)
    {
        System.out.println("appling break");
    }
    public void speedup(int increment)
    {
        System.out.println("applying speed");
    }
    public void blowhorn1()
    {
        System.out.println("jab tak he jan");
    }
    public void blowhorn2(){
        System.out.println("main hu na");
    }
}
public class interfae {
    public static void main(String[] args){
        Avoncycle obj = new Avoncycle();
        obj.applybreak(2);
        obj.speedup(3);
        obj.blowhorn2();
        obj.blowhorn1();
        obj.blowhorn();
        System.out.println(obj.a);
    }
}
