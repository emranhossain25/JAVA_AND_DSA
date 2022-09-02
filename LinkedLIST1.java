public class LinkedLIST1 {
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

    public static void printLIST(){
        Node currNODE = head;
        while (currNODE!=null){
            System.out.print(currNODE.data+"->");
            currNODE=currNODE.next;
        }
        System.out.println("NULL");
    }

    //FIND THE Nth NODE FROM END & REMOVE
//Time complexity-O(n)
// SPACE COMPLEXITY - O(1)
    public Node removeFromEnd(Node head,int n){
        if (head.next==null){
            return null;
        }

        int size=0;
        Node temp=head;
        while (temp !=null){
            temp=temp.next;
            size++;
        }

        if (n==size){
            return  head.next;
        }

        int ptf = size-n; // possition to find
        Node prev = head; //previous node
        int cp = 1; // current possition

        while (cp != ptf){
            prev = prev.next;
            cp++;
        }

        prev.next = prev.next.next;

        return head;
    }

    public static void main(String args[]){
        LinkedLIST1 list = new LinkedLIST1();
        list.push(4);
        list.push(10);
        list.push(14);
        list.push(20);
        printLIST();
        list.removeFromEnd(head,2);
    }
}
