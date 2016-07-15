package dmytro;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class BinaryTreeTraversal {

	/**
	 * Зверху вниз по лівій стороні
	 * 
	 * @param binaryTree
	 * @return
	 */
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

	/**
	 * Зліва направо
	 * 
	 * @param binaryTree
	 * @return
	 */
	public static <T> List<T> inOrderTraverse(BinaryTree<? extends T> binaryTree) {
		if (binaryTree == null) {
			return Collections.emptyList();
		}

		List<T> treeElements = new ArrayList<T>();
		treeElements.addAll(inOrderTraverse(binaryTree.left));
		treeElements.add(binaryTree.root);
		treeElements.addAll(inOrderTraverse(binaryTree.right));
		return treeElements;
	}

	/**
	 * Знизу вверх по лівій стороні
	 * 
	 * @param binaryTree
	 * @return
	 */
	public static <T> List<T> postOrderTraverse(BinaryTree<? extends T> binaryTree) {
		if (binaryTree == null) {
			return Collections.emptyList();
		}

		List<T> treeElements = new ArrayList<T>();
		treeElements.addAll(postOrderTraverse(binaryTree.left));
		treeElements.addAll(postOrderTraverse(binaryTree.right));
		treeElements.add(binaryTree.root);
		return treeElements;
	}

	/**
	 * Зверху вниз по правій стороні
	 * 
	 * @param binaryTree
	 * @return
	 */
	public static <T> List<T> preOrderTraverseFromRight(BinaryTree<? extends T> binaryTree) {
		if (binaryTree == null) {
			return Collections.emptyList();
		}

		List<T> treeElements = new ArrayList<T>();
		treeElements.add(binaryTree.root);
		treeElements.addAll(preOrderTraverseFromRight(binaryTree.right));
		treeElements.addAll(preOrderTraverseFromRight(binaryTree.left));
		return treeElements;
	}

	/**
	 * Справа наліво
	 * 
	 * @param binaryTree
	 * @return
	 */
	public static <T> List<T> inOrderTraverseFromRight(BinaryTree<? extends T> binaryTree) {
		if (binaryTree == null) {
			return Collections.emptyList();
		}

		List<T> treeElements = new ArrayList<T>();
		treeElements.addAll(inOrderTraverseFromRight(binaryTree.right));
		treeElements.add(binaryTree.root);
		treeElements.addAll(inOrderTraverseFromRight(binaryTree.left));
		return treeElements;
	}

	/**
	 * Знизу вверх по правій стороні
	 * 
	 * @param binaryTree
	 * @return
	 */
	public static <T> List<T> postOrderTraverseFromRight(BinaryTree<? extends T> binaryTree) {
		if (binaryTree == null) {
			return Collections.emptyList();
		}

		List<T> treeElements = new ArrayList<T>();
		treeElements.addAll(postOrderTraverseFromRight(binaryTree.right));
		treeElements.addAll(postOrderTraverseFromRight(binaryTree.left));
		treeElements.add(binaryTree.root);
		return treeElements;
	}

	public static <T> List<T> breadthFirstTraverse(BinaryTree<? extends T> binaryTree) {
		if (binaryTree == null) {
			return Collections.emptyList();
		}

		List<T> treeElements = new ArrayList<T>();
		Queue<BinaryTree<? extends T>> queue = new ArrayDeque<BinaryTree<? extends T>>();
		queue.add(binaryTree);
		
		while (!queue.isEmpty()) {
			BinaryTree<? extends T> element = queue.remove();
			treeElements.add(element.root);
			if (element.left != null) {
				queue.add(element.left);
			}
			if (element.right != null) {
				queue.add(element.right);
			}
		}

		return treeElements;
	}

	public static <T> List<T> mixedTraverse1(BinaryTree<? extends T> binaryTree) {
		if (binaryTree == null) {
			return Collections.emptyList();
		}

		List<T> treeElements = new ArrayList<T>();
		treeElements.add(binaryTree.root);
		treeElements.addAll(preOrderTraverse(binaryTree.left));
		treeElements.addAll(inOrderTraverse(binaryTree.right));
		return treeElements;
	}

	public static <T> List<T> mixedTraverse2(BinaryTree<? extends T> binaryTree) {
		if (binaryTree == null) {
			return Collections.emptyList();
		}

		List<T> treeElements = new ArrayList<T>();
		treeElements.add(binaryTree.root);
		treeElements.addAll(preOrderTraverse(binaryTree.left));
		treeElements.addAll(postOrderTraverse(binaryTree.right));
		return treeElements;
	}

}
