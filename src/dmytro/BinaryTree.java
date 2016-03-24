package dmytro;

public class BinaryTree<T extends Comparable<T>> {

    public T root;
    public BinaryTree<T> left;
    public BinaryTree<T> right;

    public BinaryTree() {

    }

    public BinaryTree(T root) {
        this.root = root;
    }

    public void add(T element) {
        if (root == null) {
            root = element;
        } else if (element.compareTo(root) > 0) {
            if (right == null) {
                right = new BinaryTree<T>(element);
            } else {
                right.add(element);
            }
        } else if (element.compareTo(root) < 0) {
            if (left == null) {
                left = new BinaryTree<T>(element);
            } else {
                left.add(element);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(root);
        if (left != null || right != null) {
            builder.append("(");
            if (left != null) {
                builder.append(left.toString());
            }

            if (left != null && right != null) {
                builder.append(",");
            }

            if (right != null) {
                builder.append(right.toString());
            }

            builder.append(")");
        }
        return builder.toString();
    }
}
