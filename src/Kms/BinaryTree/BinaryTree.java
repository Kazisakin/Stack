package Kms.BinaryTree;

public class BinaryTree<T extends Comparable<T>> {
    class Node {
        T data;
        Node left, right;

        public Node(T data) {
            this.data = data;
            left = right = null;
        }
    }

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(T data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, T data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void remove(T data) {
        root = removeRec(root, data);
    }

    private Node removeRec(Node root, T data) {
        if (root == null) {
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = removeRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = removeRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);

            root.right = removeRec(root.right, root.data);
        }

        return root;
    }

    private T minValue(Node root) {
        T minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return sizeRec(root);
    }

    private int sizeRec(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeRec(node.left) + sizeRec(node.right);
    }

    @Override
    public String toString() {
        return "Binary Tree: " + root;
    }
}
