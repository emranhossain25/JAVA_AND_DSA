import java.util.*;
class rectangle{
    public double height;
    public double width;
    public String color;

    public rectangle(){
        this.height=1;
        this.width=1;
        this.color="white";
    }

    public rectangle(double high,double wid){
        this.height=high;
        this.width=wid;
    }

    public void setHeight(double high){
        this.height=high;
    }

    public void setWidth(double wid){
        this.width=wid;
    }

    public void setColor(String col){
        this.color=col;
    }

    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return 2*(height+width);
    }
}
public class Rectaangle {
    public static void main(String[]args){
        rectangle rec = new rectangle();
        rectangle rec2= new rectangle(1,1);
        rec2.getArea();
        rec2.getPerimeter();
    }
}
