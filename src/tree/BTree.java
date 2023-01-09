package tree;

public class BTree {
    TreeNode root;

    public void add(int value, TreeNode node) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            if (value <= node.data) {
                if (node.left == null) {
                    node.left = new TreeNode(value);
                } else {
                    add(value, node.left);
                }
            } else {
                if (node.right == null) {
                    node.right = new TreeNode(value);
                } else {
                    add(value, node.right);
                }
            }
        }
    }

    public void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }

    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.println(node.data);
            inOrder(node.left);
            inOrder(node.right);
        }
    }

    public void postOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            inOrder(node.right);
            System.out.println(node.data);
        }
    }


    public static void main (String args[]) {
        BTree t = new BTree();

        int[] input = new int[]{2,4,5,7,9,10,14,20,21,23};


//        t.root = new TreeNode(5);
//        t.add(3, t.root);
//        t.add(1, t.root);
//        t.add(10, t.root);
//        t.add(9, t.root);
//        t.add(11, t.root);
//        System.out.println("=== In order ===");
//        t.inOrder(t.root);
//        System.out.println("=== Pre order ===");
//        t.preOrder(t.root);
//        System.out.println("=== Post order ===");
//        t.postOrder(t.root);

    }
}
