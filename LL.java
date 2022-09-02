import java.awt.*;
import java.util.LinkedList;
import java.util.concurrent.Callable;

public class LL {

/*    Node head;
    private int size;

    LL(){
        size=0;
    }

    public  class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void printLIST(){
        Node currNode=head;

        while (currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }

        System.out.println("NULL");
    }

    public void addFirst(int data){
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
    }


    public void addLast(int data){
        Node newnode = new Node(data);

        if (head==null){
            head=newnode;
        }
        Node lastNODE = head;

        while (lastNODE.next!=null){
            lastNODE = lastNODE.next;
        }
        lastNODE.next=newnode;
    }

    public void addIndex(int index,int data){
        if (index>size || index<0){
            System.out.println("invalid index");
            return;
        }
        size++;

        Node newNode = new Node(data);

        if (head==null || index==0){
            newNode.next=head;
            head=newNode;
            return;
        }

        Node currNode = head;
        for (int i=1; i<size;i++){
            if (i==index){
                Node nextNODE=currNode.next;
                currNode.next=newNode;
                newNode.next=nextNODE;
                break;
            }
            currNode=currNode.next;
        }
    }

    public void removeFirst(){
        if (head==null){
            System.out.println("Empyy linkedlist cant delete");
            return;
        }
        head=this.head.next;
        size--;
    }

    public void removeLast(){
        if (head==null){
            System.out.println("Empyy linkedlist cant delete");
            return;
        }

        size--;

        if (head.next==null){
            head=null;
            return;
        }

        Node currNode=head;
        Node lastNode=head.next;

        while (lastNode.next!=null){
            currNode=currNode.next;
            lastNode=lastNode.next;
        }
        currNode.next=null;
    }

    public int getSize(){
        return size;
    }
*/
    public static void main(String args[]){
     /*   LL list = new LL();
        list.addFirst(1);
        list.addIndex(1,5);
        list.addLast(10);
        list.addLast(11);
        list.printLIST();

        list.removeFirst();
        list.removeLast();
        list.printLIST();

        System.out.println(list.getSize());*/

        LinkedList<Integer>list=new LinkedList<>();
        list.addFirst(1);
        list.addLast(10);
        list.addLast(11);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
