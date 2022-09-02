interface Mycamera{
    void takesnap();
    void recordvideo();
    default void record4kvideo()
    {
        System.out.println("Recoding in 4k...");
    }
}
interface MyWfi{
    String[] getNetwork();
    void connect(String network);
}
interface GPS{
    void tracLocation();
}
interface mediaplayer{
    void playMusic();
}
class Mycellphone{
    void callNumber(int number)
    {
        System.out.println("Calling...."+number);
    }
    void pickCall()
    {
        System.out.println("connecting.....");
    }
}
class Smartphone extends Mycellphone implements Mycamera,MyWfi,GPS,mediaplayer{
    @Override
    public void takesnap() {
        System.out.println("taking snap....");
    }
    public void recordvideo(){
        System.out.println("RECODING IN 4K..");
    }
    public String [] getNetwork()
    {
        System.out.println("Getting Network List.....");
        String [] netwoklist = {"Emran","jas","N"};
        return netwoklist;
    }
    public void connect(String network)
    {
        System.out.println("Connectin...."+network);
    }
    public void tracLocation()
    {
        System.out.println("Tracking network....");
    }
    public void playMusic()
    {
        System.out.println("playing music.....");
    }
}
public class POLYMORPHISM_59 {
    public static void main(String[] args){
        smartphone s = new smartphone();
        s.music();
        s.showtime();
        s.showtime();
    }
}
