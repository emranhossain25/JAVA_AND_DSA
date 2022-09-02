class phone{
    public void showtime()
    {
        System.out.println("time is 1.30am");
    }
    public void on()
    {
        System.out.println("turning on the phone");
    }
}
class smartphone extends phone{
    public void music()
    {
        System.out.println("play music");
    }
    public void on()
    {
        System.out.println("turning on smartphone");
    }
}
public class Dynaic_methods_dispatch {
    public static void main(String[] args){
        phone obj = new smartphone();
        obj.on();
        obj.showtime();
       // obj.music(); NOT ALLOW WE ARE IMPLEMENT ONLY WHICH ELEMENT PRESENT IN SUB CLASS
    }
}
