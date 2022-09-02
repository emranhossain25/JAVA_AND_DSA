class  Employee{
              int id;
              String name;
              int salary;
           public void printdetails(){
               System.out.println("MY ID "+id);
               System.out.println("AND MY NAME IS "+name);
    }
          public int getsalary(){
               return  salary;
          }
}
public class customclass {
    public static void main(String[] args){
        Employee EMRAN = new Employee();
        Employee JAS = new Employee();
        Employee NUR = new Employee();
        EMRAN.name="EMRAN HOSSAN";
        EMRAN.id=0001;
        EMRAN.salary=100000000;
        JAS.salary=10000;
        JAS.id=0002;
        JAS.name="JASMIN";
        NUR.name="NURJAHAN";
        NUR.id=0003;
        NUR.salary=20000;
        EMRAN.printdetails();
        JAS.printdetails();
        System.out.println();
        NUR.printdetails();
    }
}
