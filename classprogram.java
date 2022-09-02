import java.util.Scanner;
class cylinder{
    private  int radius;
    private  int height;
    public  cylinder()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ënter raius");
        radius=sc.nextInt();
        System.out.println("enter the height");
        height=sc.nextInt();
    }
    public  double surfaceA()
    {
        return  2 * Math.PI * radius * radius * height  + 2 * Math.PI * radius * height ;
    }
    public  double volume()
    {
        return  Math.PI * radius * radius * height ;
    }
}

public class classprogram {
    public static  void  main(String[] args){
       cylinder mycylindern = new cylinder();
       System.out.println(mycylindern.surfaceA());
       System.out.println(mycylindern.volume());
    }
}
