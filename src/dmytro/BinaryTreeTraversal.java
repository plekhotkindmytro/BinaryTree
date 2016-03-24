package dmytro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeTraversal {

    public static <T> List<T> preOrderTraverse(BinaryTree<? extends T> binaryTree) {
        if (binaryTree == null) {
            return Collections.emptyList();
        }

        List<T> treeElements = new ArrayList<T>();
        treeElements.add(binaryTree.root);
        treeElements.addAll(preOrderTraverse(binaryTree.left));
        treeElements.addAll(preOrderTraverse(binaryTree.right));
        return treeElements;
    }
}
