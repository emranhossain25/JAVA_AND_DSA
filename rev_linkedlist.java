public class rev_linkedlist {
   public static  Node head;

    public class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
            this.next=null;
        }
    }


    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public  void reverseItar(){
        if (head==null || head.next==null){
            return;
        }

        Node prev = head;
        Node currNode = head.next;

        while (currNode!=null){
            Node next = currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=next;
        }
        head.next=null;
        head=prev;
    }

    public Node reverseRECURSIVELY(Node head){
        if (head==null || head.next==null){
            return head;
        }

        Node newHead = reverseRECURSIVELY(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }
    public static void main(String args[]){
        rev_linkedlist list = new rev_linkedlist();

        list.addFirst(5);
        list.addFirst(10);
        list.addFirst(15);
        list.addFirst(20);
        list.addFirst(25);
        list.addFirst(30);

        list.printList();
       // list.reverseItar();
        list.reverseRECURSIVELY(list.head);
        list.printList();
    }
}
