
public class DSA_TREE {
        static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        static class binarytree{
            static  int idk = -1;
            public  static Node buildtree(int nodes[]){
                idk++;
                if (nodes[idk]==-1){
                    return null;
                }
                Node newnode=new Node(nodes[idk]);
                newnode.left=buildtree(nodes);
                newnode.right=buildtree(nodes);
                return newnode;
            }
        }

        public  static void preOrder(Node root){
            if (root==null){
               //System.out.println(-1+"");
                return;
            }
            System.out.println(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inORDER(Node root){
            if (root==null){
                //System.out.println(-1+"");
                return;
            }
            inORDER(root.left);
            System.out.println(root.data+" ");
            inORDER(root.right);
        }
        public static void postORDER(Node root){
            if (root==null){
                //System.out.println(-1+"");
                return;
            }
            postORDER(root.left);
            postORDER(root.right);
            System.out.println(root.data+" ");
        }
        public static int height(Node root){
            if (root==null)
            {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight,rightHeight) + 1;
        }
        public static int countOFnodes(Node root){
            if (root==null){
                return 0;
            }

            int leftNodes = countOFnodes(root.left);
            int rightNodes = countOFnodes(root.right);
            return leftNodes+rightNodes+1;
        }

        public static int sumOfNODES(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSum = sumOfNODES(root.left);
            int rightSun = sumOfNODES(root.right);
            return leftSum + rightSun + root.data;
        }

        public  static  int diameter(Node root){
            if (root==null){
                return 0;
            }

            int dia1 = height(root.left) + height(root.right) + 1;
            int dia2 = diameter(root.left);
            int dia3 = diameter(root.right);

            return Math.max(dia1,Math.max(dia1,dia2));
        }
//i dont solve this i willsolve those problem tommorw
   /* public static TreeInfo diameter(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTI = diameter(root.left);
        TreeInfo rightTI = diameter(root.right);

        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;

        int diam1 = leftTI.height + rightTI.height + 1;
        int diam2 = leftTI.diam;
        int diam3 = rightTI.diam;

        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
    }
    public boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val == subRoot.val){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
*/
    public static void main(String args[]) {
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            binarytree tree=new binarytree();
            Node root=tree.buildtree(nodes);
            preOrder(root);
        System.out.println();
            inORDER(root);
        System.out.println();
            postORDER(root);
        System.out.println();
        System.out.println(height(root));
        System.out.println(countOFnodes(root));
        System.out.println(sumOfNODES(root));
        System.out.println(diameter(root));
    }
}
