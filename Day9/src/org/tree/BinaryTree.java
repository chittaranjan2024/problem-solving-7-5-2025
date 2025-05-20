package org.tree;

class Node
{
	int data;
	Node left, right;
	
	public Node(int data)
	{
		this.data=data;
		this.left=this.right=null;
	}
}
public class BinaryTree {

	Node root;
	
	public BinaryTree()
	{
		root=null;
	}
	
	Node insert(Node node,int data)
	{
		if(node==null)
		{
			return new Node(data);
		}
		
		if(data <node.data)
		{
			node.left=insert(node.left, data);
		}
		else
		{
			node.right=insert(node.right, data);
		}
		
		return node;
	}
	
	void inOrder(Node node)
	{
		if(node!=null)
		{
			inOrder(node.left);
			System.out.print(node.data+ " ");
			inOrder(node.right);
		}
	}
	
	void preOrder(Node node)
	{
		if(node!=null)
		{
			System.out.print(node.data+ " ");
			inOrder(node.left);
			inOrder(node.right);
		}
	}
	

	void postOrder(Node node)
	{
		if(node!=null)
		{
			
			inOrder(node.left);
			inOrder(node.right);
			System.out.print(node.data+ " ");
		}
	}
	public static void main(String[] args) {
		

		BinaryTree tree=new BinaryTree();
		
		tree.root=tree.insert(tree.root, 10);
		tree.insert(tree.root, 5);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 3);
		tree.insert(tree.root, 7);
		tree.insert(tree.root, 15);
		
		System.out.println("Inorder:");
		tree.inOrder(tree.root);
		
		System.out.println();
		
		System.out.println("Postorder:");
		tree.postOrder(tree.root);
		
		System.out.println();
		
		System.out.println("Preorder:");
		tree.preOrder(tree.root);
		
		
	}

}


/*
 *     10
 *    /  \
 *   5   20
 *  / \   /
 * 3   7 15
 * 
 */
