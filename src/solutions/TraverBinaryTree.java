package solutions;

import java.util.Stack;

public class TraverBinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public static void recursionPreorder(TreeNode root){
        if(root!=null){
            System.out.println(root.val);
            recursionPreorder(root.left);
            recursionPreorder(root.right);
        }
    }

    public static void recursionMiddleorder(TreeNode root){
        if (root!=null){
            recursionMiddleorder(root.left);
            System.out.println(root.val);
            recursionMiddleorder(root.right);
        }
    }

    public static void recursionPostorder(TreeNode root){
        if (root!=null){
            recursionPostorder(root.left);
            recursionPostorder(root.right);
            System.out.println(root.val);
        }
    }

    public static void Preorder(TreeNode root){
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        TreeNode node = root;

        while (node!=null || !myStack.isEmpty()){
            while (node!=null){
                System.out.println(node.val);
                myStack.push(node);
                node = node.left;
            }

            if(!myStack.isEmpty()){
                node = myStack.pop();
                node = node.right;
            }
        }
    }

    public static void Middleorder(TreeNode root){
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        TreeNode node = root;

        while (node!=null || !myStack.isEmpty()){
            while (node!=null){
                myStack.push(node);
                node = node.left;
            }

            if (!myStack.isEmpty()){
                node = myStack.pop();
                System.out.println(node.val);
                node = node.right;
            }
        }
    }

    public static void Postorder(TreeNode root){
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        TreeNode node = root;
        TreeNode lastVisit = root;
        while (node !=null || !myStack.isEmpty()){
            while (node!=null){
                myStack.push(node);
                node = node.left;
            }

            node = myStack.peek();
            if (node.right==null || node.right==lastVisit){
                System.out.println(node.val);
                myStack.pop();
                lastVisit = node;
                node = null;
            }else{
                node = node.right;
            }
        }
    }

}
