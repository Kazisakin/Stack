package Kms.BinaryTree;

public class BinaryTreeDriver {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(15);
        tree.insert(30);

        System.out.println("Original tree (Preorder):");
        tree.preOrder();

        System.out.println("\nRemoving 15:");
        tree.remove(15);
        tree.preOrder();

        System.out.println("\nRemoving 10 (root):");
        tree.remove(10);
        tree.preOrder();

        System.out.println("\nRemoving 20 (node with 2 children):");
        tree.remove(20);
        tree.preOrder();

        System.out.println("\nSize of the tree: " + tree.size());

        System.out.println("\nInorder Traversal:");
        tree.inOrder();

        System.out.println("\nPostorder Traversal:");
        tree.postOrder();
    }
}
