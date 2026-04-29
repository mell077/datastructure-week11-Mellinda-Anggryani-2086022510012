package dsweek11;

public class SimpleTree<Type> {
    private TreeNode<Type> root;

    public SimpleTree(TreeNode<Type> root) {
        this.root = root;
    }

    // =========================
    // 4.3e - Print Leaves
    // =========================
    public void printLeaves() {
        printLeaves(root);
    }

    private void printLeaves(TreeNode<Type> node) {
        if (node == null) return;

        if (node.children.isEmpty()) {
            System.out.print(node.data + " ");
            return;
        }

        for (TreeNode<Type> child : node.children) {
            printLeaves(child);
        }
    }

    // =========================
    // 4.3f - Print at Depth N
    // =========================
    public void printAtDepth(int n) {
        printAtDepth(root, 0, n);
    }

    private void printAtDepth(TreeNode<Type> node, int depth, int target) {
        if (node == null) return;

        if (depth == target) {
            System.out.print(node.data + " ");
            return;
        }

        if (depth > target) return;

        for (TreeNode<Type> child : node.children) {
            printAtDepth(child, depth + 1, target);
        }
    }
}