public class Linkedlist2 {
    static   Node head;
    public static class Node {
        int data;
        static Node next;

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

    //CHECK LINKEDLIST IS PALINDROME OR NOT
    //TIME COMPLEXITY - O(n)
    //SPACE COMKPLEXITY - O(1)

    public  static Node getmiddle(Node head){
        //FIND MIDDLE USING HARE TURTLE METHDS / FLOYDS METHODS
        Node Hare = head;
        Node Turtle = head;

        while (Hare.next !=null && Hare.next.next !=null){
            Hare = Hare.next.next;
            Turtle = Turtle.next;
        }

        return Turtle;
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while (curr !=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return  prev;
    }

    //palindrome function

    public static boolean isPalindrome(Node head){
        if ( head==null || head.next==null){
            return true;
        }

        Node firstHALFend = getmiddle(head);
        Node secondHALFstart = reverse(firstHALFend.next);
        Node firstHALFstart = head;
        while (secondHALFstart !=null){
            if(secondHALFstart.data != firstHALFstart.data){
                return  false;
            }

            secondHALFstart = secondHALFstart.next;
            firstHALFstart = firstHALFstart.next;
        }

        return  true;

    }
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.push(4);
        list.push(10);
        list.push(14);
        list.push(20);
        printLIST();
        isPalindrome(head);
      /*  if (isPalindrome(head)){
            System.out.println("ITS IS PALINDROME...");
        }

        else {
            System.out.println("ITS NOT PALINDROME...");
        }*/
    }
}
