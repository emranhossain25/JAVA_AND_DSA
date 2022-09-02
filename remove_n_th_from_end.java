import java.util.LinkedList;

public class remove_n_th_from_end {
    static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            System.out.println("Empty...");
            return;
        }

        head.next = newNode;
        head = newNode;
    }
    public static void main(String args[]){

    }
}
