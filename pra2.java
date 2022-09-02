public class pra2 {
    static node head;

    public static class node{
        int data;
        node next;

        node(int add){
            this.data=data;
            this.next=null;
        }
    public static void push(int data){
            node newnode = new node(data);
            head=newnode;

            newnode.next=head;
            head=newnode;
    }
        public static void printLIST(){
            node currNODE = head;
            while (currNODE!=null){
                System.out.print(currNODE.data+"->");
                currNODE=currNODE.next;
            }
            System.out.println("NULL");
        }
    public static node reverse(node head){
            node prev = null;
            node currnode = head;
            while (currnode!=null){
                node next = currnode;
                currnode.next=prev;
                prev=currnode;
                currnode=next;
            }
            return prev;
    }

    public static node  getmiddle(node head){
            node hare =head;
            node turtle = head;

            while (hare.next!=null && hare.next.next!=null ){
                hare=hare.next.next;
                turtle=turtle.next;
            }

            return turtle;
    }

    public static boolean ispPalimdrome(node head){
            if (head==null || head.next==null){
                return  true;
            }

            node firstHalfEND = getmiddle(head);
            node secondhalfSTART = reverse(firstHalfEND.next);
            node firsthalfstar = head;

            while(secondhalfSTART!=null){
                if (secondhalfSTART.data!=firsthalfstar.data){
                    return false;
                }
                secondhalfSTART=secondhalfSTART.next;
                firsthalfstar=firsthalfstar.next;
            }
            return true;
    }
    }
    public static void main(String args[]){
           LinkedList list = new LinkedList();
           list.push(57);
           list.push(56);
           list.push(50);
           list.push(51);
           list.push(52);

           head.printLIST();
    }
}
