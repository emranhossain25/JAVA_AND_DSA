import java.util.Scanner;
 class Ticket{
    private int ticketid;
    private int price;
    private static int avaibleticket;
    public void setTicked(int id)
    {
        this.ticketid=id;
    }
    public int getTicketid()
    {
        return this.ticketid;
    }
    public void setPrice(int p)
    {
        this.price=p;
    }
    public int getPrice()
    {
        return this.price;
    }
    public static void setAvaibleticket(int ticket)
    {
        if (ticket<=0)
            System.out.println("Availble Tickets should be greater than 0");
        else
            avaibleticket=ticket;
    }
    public static int getAvaibleticket()
    {
        return avaibleticket;
    }
    public int calculateTicketcost(int noofticket)
    {
        int ticket=getAvaibleticket();
        if (ticket<noofticket)
            return -1;
        else
        {
            int price=getPrice();
            int available=ticket-noofticket;
            setAvaibleticket(available);
            int amount=noofticket*price;
            return amount;
        }
    }
}
public class Ticket_Calculation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Ticket t=new Ticket();
        System.out.println("Enter number of bookings:");
        int book= sc.nextInt();
        System.out.println("Enter the availle tickets");
        int avaible=sc.nextInt();
        t.setAvaibleticket(avaible);
        System.out.println("Enter the ticket id");
        int id= sc.nextInt();
        t.setTicked(id);
        System.out.println("Enter the price");
        int price= sc.nextInt();
        t.setPrice(price);
        System.out.println("Enter the no of tickets:");
        int tickets= sc.nextInt();
        if (tickets<=avaible) {
            System.out.println("Available tickets:" + t.getAvaibleticket());
        }
        int amount=t.calculateTicketcost(tickets);
        if (amount==-1)
        {
            System.out.println("Tickets not sufficient/availble");
        }
        else
        {
            System.out.println("Total amount"+amount);
            System.out.println("Availble After Booking:"+ t.getAvaibleticket());
        }
    }
}                                                                                                              
