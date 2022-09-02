import java.util.Scanner;
class Rectangle{
    public float width;
    public float length;
    Rectangle(float w,float l){
        this.length=l;
        this.width=w;
    }
    public double Area()
    {
        return width*length;
    }
    public double Perimeter()
    {
        return 2*(length*width);
    }
}
class cuboid extends Rectangle{
    public float height;
    cuboid(float w,float l,float h){
        super(w,l);
        this.height=h;
    }
    public double volume()
    {
        return width*length*height;
    }
}
public class PRACTICE_INHERITANCE {
    public static void main(String[] args){
        //Rectangle obj1=new Rectangle(5,6);
        cuboid obj2=new cuboid(7,6,9);
        System.out.println(obj2.Area());
        System.out.println(obj2.Perimeter());
        System.out.println(obj2.volume());
    }
}
