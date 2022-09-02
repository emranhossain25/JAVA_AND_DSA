import java.util.*;
import java.util.LinkedList;

public class tree {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){

            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class BinaryTree{
        static int idk=-1;
        public static Node BuildTree(int nodes[]){
            idk++;

            if (nodes[idk]==-1){
                return null;
            }

            Node newnode=new Node(nodes[idk]);
            newnode.left=BuildTree(nodes);
            newnode.right=BuildTree(nodes);

            return newnode;
        }
    }

    public static void PREORDER(Node root){
        if (root==null){
            return;
        }

        System.out.print(root.data+" ");
        PREORDER(root.left);
        PREORDER(root.right);
    }

    public static void INORDER(Node root){
        if (root==null){
            return;
        }

        INORDER(root.left);
        System.out.print(root.data+" ");
        INORDER(root.right);
    }


    public static void POSTORDER(Node root){

        if (root==null){
            return;
        }

        POSTORDER(root.left);
        POSTORDER(root.right);
        System.out.print(root.data+" ");
    }


    public static void LEVEL_ORDER_TRAVERSAL(Node root){
        Queue<Node>Q=new LinkedList<>();

        Q.add(root);
        Q.add(null);

        while (!Q.isEmpty()){
            Node curr = Q.remove();

            if (curr==null){
                System.out.println();
                if (Q.isEmpty()){
                    break;
                }
                else{
                    Q.add(null);
                }
            }
            else {
                System.out.print(curr.data+" ");
                if (curr.left!=null){
                    Q.add(curr.left);
                }
                if (curr.right!=null){
                    Q.add(curr.right);
                }
            }
        }
    }

    public static int countOFnodes(Node root){
        if (root==null){
            return  0;
        }

        int leftCOUNT = countOFnodes(root.left);
        int rightCOUNT = countOFnodes(root.right);

        return leftCOUNT+rightCOUNT+1;
    }

    public static int sumOFnodes(Node root){
        if (root==null){
            return 0;
        }

        int leftSUM = sumOFnodes(root.left);
        int rightSUM = sumOFnodes(root.right);

        return leftSUM + rightSUM + root.data;
    }


    public static int height(Node root){
        if (root==null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int HEIGHT = leftHeight + rightHeight +1;

        return HEIGHT;
    }

    public static int DIAMETER(Node root){
        if (root==null){
            return  0;
        }

        int dia1 = DIAMETER(root.left);
        int dia2 = DIAMETER(root.right);
        int dia3 = height(root.left) + height(root.right) +1;

        return Math.max(dia3,Math.max(dia1,dia2));

    }


    public static boolean isINDETICAL(Node root,Node subROOT){
        if (root==null &&  subROOT==null){
            return true;
        }

        if (root==null || subROOT==null){
            return  false;
        }

        if (root.data==subROOT.data){
            return isINDETICAL(root.left,subROOT.left) && isINDETICAL(root.right,subROOT.right);
        }

        return false;
    }

    public static boolean isSUBTREE(Node root,Node subROOT){
        if (subROOT==null){
            return true;
        }

        if (root==null){
            return  false;
        }

        if (root.data== subROOT.data){
            if (isINDETICAL(root,subROOT)){
                return true;
            }
        }
        return isSUBTREE(root.left,subROOT) || isSUBTREE(root.right,subROOT);
    }



public static  class tREEINFO{
        int ht;
        int  dia;

        tREEINFO(int ht,int dia){
            this.ht=ht;
            this.dia=dia;
        }

        public static tREEINFO dIAMETER(Node root){
            if (root==null){
                new tREEINFO(0,0);
            }

            tREEINFO leftT = dIAMETER(root.left);
            tREEINFO rightT = dIAMETER(root.right);

            int HEIGHT = Math.max(leftT.ht,rightT.ht) +1;

            int dia1 = leftT.ht + rightT.ht +1;
            int dia2 = leftT.dia;
            int dia3 = rightT.ht;

            int Diamtr = Math.max(dia1,Math.max(dia2,dia3));

            return new tREEINFO(HEIGHT,Diamtr);
        }
}

    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int node[]={2,4,-1,-1,5,-1,-1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        Node subROOT = tree.BuildTree(node);
        //System.out.print(root.data+" ");
       /* PREORDER(root);
        System.out.println();
        INORDER(root);
        System.out.println();
        POSTORDER(root);*/
        //LEVEL_ORDER_TRAVERSAL(root);

       // isSUBTREE(root,subROOT);

        /*System.out.println(countOFnodes(root));
        System.out.println(sumOFnodes(root));
        System.out.println(height(root));*/
        System.out.println(DIAMETER(root));

    }
}
