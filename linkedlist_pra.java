public class linkedlist_pra {
    static Node head;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void push(int data){
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
    }

    public static boolean hascycle(Node head){
        Node hare = head;
        Node turtle = head;

        while (hare!=null && hare.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;

            if (hare==turtle){
                return true;
            }
        }
        return false;
    }
    public static void printfList(){
        Node currNode = head;
        while (currNode!=null){
            System.out.println(currNode.data+"->");
            currNode=currNode.next;
        }
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.push(4);
        list.push(6);
        list.push(10);
        list.push(14);
        printfList();
        list.head.next.next.next.next=list.head;
        if (hascycle(head)){
            System.out.println("LOOPS IS FOUND...");
        }
        else {
            System.out.println("LOOPS IS NOT FOUND....");
        }
    }
}
