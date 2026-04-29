package dsweek11;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<Type> {
    Type data;
    List<TreeNode<Type>> children;

    public TreeNode(Type data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode<Type> child) {
        children.add(child);
    }
}