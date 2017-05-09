package SubstructureInTree_18;

import Tree.TreeNode;

/**
 * Created by bupt on 5/7/17.
 */
public class Solution {
    public static boolean hasSubTree(TreeNode root1,TreeNode root2){
        boolean result = false;

        if(root1 != null && root2 != null){
            if(root1.data == root2.data)
                result = doesTreeHaveTree2(root1,root2);
            if(!result)
                result = hasSubTree(root1.left,root2);
            if(!result)
                result = hasSubTree(root1.right,root2);
        }
        return result;
    }

    public static boolean doesTreeHaveTree2(TreeNode root1,TreeNode root2){
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;

        if(root1.data != root2.data)
            return false;
        return doesTreeHaveTree2(root1.left,root2.left)
                && doesTreeHaveTree2(root1.right,root2.right);
    }

    public static void main(String[] args){
        TreeNode node = new TreeNode(4);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(2);
        node3.left = node;
        node3.right = node2;
        TreeNode node4 = new TreeNode(9);
        TreeNode node5 = new TreeNode(8);
        node5.left = node4;
        node5.right = node3;
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(8);
        node7.left = node5;
        node7.right = node6;

        TreeNode node2_1 = new TreeNode(9);
        TreeNode node2_2 = new TreeNode(2);
        TreeNode node2_3 = new TreeNode(8);
        node2_3.left = node2_1;
        node2_3.right = node2_2;

        System.out.println(hasSubTree(node7,node2_3));
    }
}
