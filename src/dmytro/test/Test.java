package dmytro.test;

import dmytro.BinaryTree;
import dmytro.BinaryTreeTraversal;
import dmytro.test.data.Animal;
import dmytro.test.data.Cat;

public class Test {

    public static void main(String[] args) {
        BinaryTree<Animal> a = new BinaryTree<Animal>(new Cat("Cat5"));
        a.add(new Cat("Cat2"));
        a.add(new Cat("Cat3"));
        a.add(new Cat("Cat4"));
        a.add(new Cat("Cat1"));
        a.add(new Cat("Dog1"));
        a.add(new Cat("Dog2"));
        a.add(new Cat("Dog3"));
        a.add(new Cat("Dog4"));
        a.add(new Cat("Dog5"));
        System.out.println(a);
        System.out.println(BinaryTreeTraversal.preOrderTraverse(a));
    }
}
