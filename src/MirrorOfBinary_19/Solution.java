package MirrorOfBinary_19;

import Tree.TreeNode;

/**
 * Created by bupt on 5/7/17.
 */
public class Solution {
    public static void mirrorRecursively(TreeNode root){
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left != null)
            mirrorRecursively(root.left);
        if(root.right != null)
            mirrorRecursively(root.right);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(5);
        node3.left = node1;
        node3.right = node2;
        node1.left = node4;

        System.out.println(node3.data + " "+ node3.left.data+" "+node3.right.data);
        mirrorRecursively(node3);
        System.out.println(node3.data + " "+ node3.left.data+" "+node3.right.data);

    }
}
