import java.util.*;
public class LinkedList {
   static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void push(int data) {
        Node newNode = new Node(data);

       /* if (head == null) {
            System.out.println("Empty...");
            return;
        }
*/
        newNode.next = head;
        head = newNode;
    }
//most importan quition detecting loop
 //us8ing HARE TURTLE methods Flyods methods
 // one implement is due
// Time complexity -O(n) sPACE COMPLEXITY - O(1)
   public static boolean has_Cycle(Node head){
        Node hare = head;
        Node turtle=head;

        while (hare!=null && hare.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;

            if (hare==turtle){
                return  true;
            }
        }
        return false;
    }
    public static void printLIST(){
        Node currNODE = head;
        while (currNODE!=null){
            System.out.print(currNODE.data+"->");
            currNODE=currNODE.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.push(4);
        list.push(10);
        list.push(14);
        list.push(20);
        printLIST();

        //i create the function for testing
       list.head.next.next.next.next = list.head;

        if (has_Cycle(head)){
            System.out.println("LOOPS IS FOUND");
        }
        else {
            System.out.println("loop is not found..");
        }
    }
}
