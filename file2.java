import java.util.Scanner;
public class file2 {
    public static void  main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      float height,width,Area;
      System.out.println("enter the height");
      height=in.nextFloat();
      System.out.println("enter widrh");
      width=in.nextFloat();
      Area=height * width;
      System.out.println(Area);
    }
}
