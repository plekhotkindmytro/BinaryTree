package dmytro.test;

import dmytro.BinaryTree;
import dmytro.BinaryTreeTraversal;

public class Test {

	public static void main(String[] args) {

		test1();

		test2();

	}

	private static void test1() {
		System.out.println("*** Test 1 ***");
		BinaryTree<Character> a = new BinaryTree<Character>('a');
		BinaryTree<Character> b = new BinaryTree<Character>('b');
		BinaryTree<Character> c = new BinaryTree<Character>('c');
		BinaryTree<Character> d = new BinaryTree<Character>('d');
		BinaryTree<Character> e = new BinaryTree<Character>('e');
		BinaryTree<Character> f = new BinaryTree<Character>('f');
		BinaryTree<Character> m = new BinaryTree<Character>('m');
		BinaryTree<Character> h = new BinaryTree<Character>('h');
		BinaryTree<Character> o = new BinaryTree<Character>('o');
		BinaryTree<Character> p = new BinaryTree<Character>('p');
		BinaryTree<Character> q = new BinaryTree<Character>('q');
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = m;
		e.left = h;
		e.right = o;
		m.left = p;
		m.right = q;

		System.out.println("Tree: " + a);
		System.out.println("preOrderTraverse: " + BinaryTreeTraversal.preOrderTraverse(a));
		System.out.println("inOrderTraverse: " + BinaryTreeTraversal.inOrderTraverse(a));
		System.out.println("postOrderTraverse: " + BinaryTreeTraversal.postOrderTraverse(a));
		System.out.println("preOrderTraverseFromRight: " + BinaryTreeTraversal.preOrderTraverseFromRight(a));
		System.out.println("inOrderTraverseFromRight: " + BinaryTreeTraversal.inOrderTraverseFromRight(a));
		System.out.println("postOrderTraverseFromRight: " + BinaryTreeTraversal.postOrderTraverseFromRight(a));
		System.out.println("breadthFirstTraverse: " + BinaryTreeTraversal.breadthFirstTraverse(a));
		System.out.println("mixedTraverse1: " + BinaryTreeTraversal.mixedTraverse1(a));
		System.out.println("mixedTraverse2: " + BinaryTreeTraversal.mixedTraverse2(a));
	}

	private static void test2() {
		System.out.println("*** Test 1 ***");
		BinaryTree<Character> G = new BinaryTree<Character>('G');
		BinaryTree<Character> E = new BinaryTree<Character>('E');
		BinaryTree<Character> B = new BinaryTree<Character>('B');
		BinaryTree<Character> D = new BinaryTree<Character>('D');
		BinaryTree<Character> F = new BinaryTree<Character>('F');
		BinaryTree<Character> K = new BinaryTree<Character>('K');
		BinaryTree<Character> M = new BinaryTree<Character>('M');
		BinaryTree<Character> R = new BinaryTree<Character>('R');
		G.left = E;
		G.right = K;
		E.left = B;
		E.right = F;
		B.right = D;
		K.right = M;
		M.right = R;

		System.out.println("Tree: " + G);
		System.out.println("preOrderTraverse: " + BinaryTreeTraversal.preOrderTraverse(G));
		System.out.println("inOrderTraverse: " + BinaryTreeTraversal.inOrderTraverse(G));
		System.out.println("postOrderTraverse: " + BinaryTreeTraversal.postOrderTraverse(G));
		System.out.println("breadthFirstTraverse: " + BinaryTreeTraversal.breadthFirstTraverse(G));

	}

}
