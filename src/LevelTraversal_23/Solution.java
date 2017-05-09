package LevelTraversal_23;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by bupt on 5/8/17.
 */
public class Solution {
    public static void printFromTopToBottom(TreeNode root){
        if(root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            System.out.print(node.data);
            if(node.left != null)
                q.add(node.left);
            if(node.right != null){
                q.add(node.right);
            }
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(10);
        root.left = node1;
        root.right = node2;
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(7);
        node1.left = node3;
        node1.right = node4;
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(11);
        node2.left = node5;
        node2.right = node6;

        printFromTopToBottom(root);
    }
}
