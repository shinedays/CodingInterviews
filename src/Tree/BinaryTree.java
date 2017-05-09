package Tree;

/**
 * Created by bupt on 5/7/17.
 */
public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        TreeNode treeNode = new TreeNode(data);
        if (root == null)
            root = treeNode;
        else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = treeNode;
                    }
                    return;
                } else{
                    current = current.right;
                    if (current == null) {
                        parent.right = treeNode;
                    }
                    return;
                }

            }
        }

    }
}
