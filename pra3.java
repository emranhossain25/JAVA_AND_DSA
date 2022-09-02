import java.net.PortUnreachableException;

public class pra3 {
    static  class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class binaryTree{
        static  int idk=-1;
        public static Node buildTREE(int nodes[]){
            idk++;
            if (nodes[idk]==-1) {
                return null;
            }
            Node newnode = new Node(nodes[idk]);
            newnode.left=buildTREE(nodes);
            newnode.right=buildTREE(nodes);
            return newnode;
        }
    }

    public static void preORDER(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.data+" ");
        preORDER(root.left);
        preORDER(root.right);
    }

    public static void inORDER(Node root){
        if(root==null){
            return;
        }
        inORDER(root.left);
        System.out.println(root.data+" ");
        inORDER(root.right);
    }

    public static void postORDER(Node root){
        if (root==null){
            return;
        }
        postORDER(root.left);
        postORDER(root.right);
        System.out.println(root.data+" ");
    }
    public static int height(Node root){
        if (root==null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return Math.max(leftheight,rightheight) + 1;
    }

    public static void main(String args[]){

    }
}
