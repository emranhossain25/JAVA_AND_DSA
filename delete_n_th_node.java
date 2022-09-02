public class delete_n_th_node {
    public static Node2 head;
    public static class Node2{
        int data;
        Node2 next;

        Node2(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void add(int data){
        Node2 currNode = new Node2(data);
        currNode.next=head;
        head=currNode;
    }

    public static Node2 find_n_th_node(Node2 head,int n){
        if (head.next==null){
            return  null;
        }

        int size=0;
        Node2 curr = head;
        while (curr!=null){
            curr=curr.next;
            size++;
        }

        if (n==size){
            return head.next;
        }

        int indextoNOde = size-n-1;
        int i=1;
        Node2 prev=head;
        while (i<indextoNOde){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return  head;
    }

    public static void printlist(){
        Node2 curr = head;
        while (curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("NULL");
    }

    public static void main(String args[]){

        delete_n_th_node list = new delete_n_th_node();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.printlist();
        System.out.println();
        list.find_n_th_node(list.head,3);
        list.printlist();
    }
}
