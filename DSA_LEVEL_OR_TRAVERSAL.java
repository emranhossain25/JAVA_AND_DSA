import java.util.*;
import java.util.LinkedList;

public class DSA_LEVEL_OR_TRAVERSAL {
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

    static class BinaryTREE{
        static int idk=-1;
        public static Node buildTREE(int nodes[]){
            idk++;
            if (nodes[idk] == -1){
                return null;
            }
            Node newNODE = new Node(nodes[idk]);
            newNODE.left=buildTREE(nodes);
            newNODE.right=buildTREE(nodes);
            return newNODE;
        }
    }

    public static void Level_order_TRAVERSAL(Node root){
        if (root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node curr = q.remove();
            if (curr==null){
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.println(curr.data+"");
                if (curr.left!=null){
                    q.add(curr.left);
                }
                if (curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTREE tree = new BinaryTREE();
        Node root = tree.buildTREE(nodes);
        Level_order_TRAVERSAL(root);
    }
}
