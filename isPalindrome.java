import java.util.*;

public class isPalindrome {
    public static Node head;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void add(int data){
        Node curr = new Node(data);
        curr.next=head;
        head=curr;
    }

    public static void printLIST(){
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println();
    }
    public static Node reverse(Node head){
       /* if (head==null || head.next==null){
            return ;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        /*head.next=null;
        head=prev;*/
        Node prev = null;
        Node curr = head;

        while (curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static Node find_Middle(Node head){
        Node hare = head;
        Node turtle = head;

        while (hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }

    public static boolean isPALIMDROME(Node head){
        if (head==null || head.next==null){
            return  true;
        }

        Node FirstHhalfEND = find_Middle(head);
        Node secontHalfFIRST = reverse(FirstHhalfEND.next);
        Node firstHALF = head;
        while (secontHalfFIRST!=null){
            if (secontHalfFIRST!=firstHALF){
                return false;
            }

            secontHalfFIRST=secontHalfFIRST.next;
            firstHALF=firstHALF.next;
        }

        return true;
    }
    public static void main(String args[]){

        isPalindrome list = new isPalindrome();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);

        list.printLIST();

        if (isPALIMDROME((list.head))){
            System.out.println("palindrome");
        }

        else {
            System.out.println("Not palimdrome");
        }
    }
}
