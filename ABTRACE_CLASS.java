abstract class  parent{
    public parent()
    {
        System.out.println("i am a constrater");
    }
    public void sayhello()
    {
        System.out.println("hello");
    }
    abstract public void great();
    abstract public void great2();
}
class  child extends parent{
    public void great()
    {
        System.out.println("good morning");
    }
    public void great2()
    {
        System.out.println("good afternoon");
    }
}
abstract  class child3 extends parent{
    public void th()
    {
        System.out.println("i am a good boy");
    }
}
public class ABTRACE_CLASS {
    public static void main(String[] args){
        child obj=new child();
        //parent p=new parent();  >> error not allow
        //child3 c=new child();   >>error not allow
        obj.great();
    }
}
