import java.util.*;

public class BST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
        } else if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        } else if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        }
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node IS = inORSUCCESSOR(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }


        return root;
    }

    public static Node inORSUCCESSOR(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printRange(Node root, int X, int Y){
        if (root==null){
            return;
        }

        if (root.data >= X && root.data <= Y){
            printRange(root.left,X,Y);
            System.out.print(root.data+" ");
            printRange(root.right,X,Y);
        }

        else if(root.data <= Y){
            printRange(root.left,X,Y);
        }
        else {
            printRange(root.right,X,Y);
        }
    }


    public static void printArrayList(ArrayList<Integer>path){
        for (int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"-> ");
        }
        System.out.println();
    }


    public static void printLEAF2ROOT(Node root,ArrayList<Integer>path){
        if (root==null){
            return;
        }
        path.add(root.data);

        if (root.left==null && root.right==null){
            printArrayList(path);
        }
        else{
            printLEAF2ROOT(root.left,path);
            printLEAF2ROOT(root.right,path);
        }

        path.remove(path.size()-1);
    }

    public static void main(String args[]){
        /*int val[]={1,56,8,9,10,12};*/
        int val[]={8,5,3,1,4,6,10,11,14};
        Node root=null;


      for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }

        inOrder(root);
        System.out.println();
        /*int key;
        key=5;
        if (search(root,key)){
            System.out.println("The Element Is Found..");
        }

        else {
            System.out.println("The Element Is Not Found");
        }*/
      /*  delete(root,11);
        inOrder(root);*/

       /* printRange(root,5,10);*/

        printLEAF2ROOT(root,new ArrayList<>());
    }
}
