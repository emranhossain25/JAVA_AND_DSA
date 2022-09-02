public class detect_cycle {

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

    public static boolean detectCYCLE(Node head){
        Node hare = head;
        Node turtle = head;

        while (hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if (hare==turtle){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){

    }
}
