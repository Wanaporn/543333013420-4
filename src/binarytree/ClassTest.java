package binarytree;

import binarytree.BinaryTree.Node;

public class ClassTest {

	public static void main(String[] args) {
		 		BinaryTree bt = new BinaryTree();
		 		Node d = new Node("d", null, null);
		 		Node e = new Node("e", null, null);
		 		Node b = new Node("b",d,e);
		 		Node f = new Node("f", null, null);
		 		Node c = new Node("c", f, null);
		 		Node a = new Node("a", b, c);
		 		a.isLeaf();
		 		System.out.println("Root is : "+a);
		 		System.out.println("Right of a is : "+a.right);
		 		System.out.println("Left  of a is : "+a.left);
		 		System.out.println("Right of b is : "+b.right);
		 		System.out.println("Left  of b is : "+b.left);
		 		System.out.println("Right of c is : "+c.right);
		 		System.out.println("Left  of c is : "+c.left);
		 		System.out.println("Right of d is : "+d.right);
		 		System.out.println("Left  of d is : "+d.left);
		 		System.out.println("Right of e is : "+e.right);
		 		System.out.println("Left  of e is : "+e.left);
		 		System.out.println("Right of f is : "+f.right);
		 		System.out.println("Left  of f is : "+f.left);
		 		System.out.println(bt.height());
		}
	}