package org.tree;

public class BSTImplementation {

	Node root;
	
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
	
	public Node delete(Node root,int key)
	{
		if(root==null) return null;
		
		if(key<root.data)
		{
			root.left=delete(root.left, key);
		}
		else if(key>root.data)
		{
			root.right=delete(root.right, key);
		}
		else
		{
			//Node with only one child or no child
			if(root.left==null)
			{
				return root.right;
			}
			if(root.right==null)
			{
				return root.left;
			}
			
			//Node with two children: Get the inorder successor(smallest in the right subtree)
			
			Node temp=findMin(root);
			root.data=temp.data;
			
			root.right=delete(root.right, temp.data);	
		}
		
		return root;
	}
	
	public Node findMin(Node root)
	{
		while(root.left!=null)
			root=root.right;
		
		return root;
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
	
	public boolean search(Node root,int target)
	{
		if(root==null) return false;
		if(target==root.data)
		{
			return true;
		}
		
		return target<root.data? search(root.left, target): search(root.right, target);
	}
	public static void main(String[] args) {
		
		BSTImplementation tree=new BSTImplementation();
		
		tree.root=tree.insert(tree.root, 50);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 80);
		
		
		System.out.println("Inorder:");
		tree.inOrder(tree.root);
		
		System.out.println();
		
		System.out.println("Postorder:");
		tree.postOrder(tree.root);
		
		System.out.println();
		
		System.out.println("Preorder:");
		tree.preOrder(tree.root);

		System.out.println();
		tree.root=tree.delete(tree.root, 20);
		System.out.println("Inorder:");
		tree.inOrder(tree.root);
		System.out.println();
		
		System.out.println(tree.search(tree.root, 70));
		
		
	}

}
