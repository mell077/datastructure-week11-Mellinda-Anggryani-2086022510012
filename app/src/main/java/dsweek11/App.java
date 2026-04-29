package dsweek11;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        TreeNode<String> root = new TreeNode<>("A");

        TreeNode<String> B = new TreeNode<>("B");
        TreeNode<String> C = new TreeNode<>("C");
        TreeNode<String> D = new TreeNode<>("D");

        root.addChild(B);
        root.addChild(C);
        root.addChild(D);

        B.addChild(new TreeNode<>("E"));
        B.addChild(new TreeNode<>("F"));

        C.addChild(new TreeNode<>("G"));

        D.addChild(new TreeNode<>("H"));
        D.addChild(new TreeNode<>("I"));

        SimpleTree<String> tree = new SimpleTree<>(root);

        System.out.print("Leaf nodes: ");
        tree.printLeaves();

        System.out.println();

        System.out.print("Nodes at depth 2: ");
        tree.printAtDepth(2);
    }
}