package RebuildBinaryTree_06;

/**
 * Created by bupt on 5/3/17.
 */
public class Solution {
    static Node root = null;
    public static void rebuildTree(int[] preorder, int[] inorder){
        root = initTree(preorder,0,preorder.length - 1,
                inorder,0,inorder.length -1);
    }

    public static int findIndex(int[] inorder,int start2, int end2,int root){
        for(int i = start2;i <= end2;i++){
            if(inorder[i] == root)
                return i;
        }
        return -1;
    }

    public static Node initTree(int[] preorder, int start1,int end1,
                                int[]inorder,int start2,int end2){
        if(start1 > end1 || start2 > end2)
            return null;
        int root = preorder[start1];
        Node node = new Node(root);
        int index = findIndex(inorder,start2,end2,root);
        int offset = index - start2 - 1;

        Node left = initTree(preorder,start1 + 1,start1 + 1 + offset,
                inorder,start2,index - 1);
        Node right = initTree(preorder,start1 + 2 + offset,end1,
                inorder,index + 1,end2);

        node.left = left;
        node.right = right;

        return node;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,6,8};

        rebuildTree(pre,in);

        System.out.println(Solution.root);

    }
}
