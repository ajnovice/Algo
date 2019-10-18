package Tree.BinarySearchTree;

class Node {

    int data;
    Node left, right;

    Node(int d) {
        this.data = d;
        this.left = this.right = null;
    }
}


public class BinaryTree {

    private static int index = 0;

    private Node constructTree(int pre[], int low, int high, int size) {


        if (index >= size || low > high) {
            return null;
        }

        Node root = new Node(pre[index]);
        index = index + 1;

        if (low == high) {
            return root;
        }

        int i;
        for (i = low; i <= high; ++i) {
            if (pre[i] > root.data) {
                break;
            }
        }


        root.left = constructTree(pre, index, i - 1, size);
        root.right = constructTree(pre, i, high, size);

        return root;
    }



    private void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int pre[] = new int[]{10, 5, 1, 7, 40, 50};
        int size = pre.length;
        Node root = tree.constructTree(pre, 0,size-1,size);
        System.out.println("Inorder traversal of the constructed tree is ");
        tree.printInorder(root);
    }
}
