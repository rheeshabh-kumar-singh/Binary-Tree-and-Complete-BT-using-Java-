import java.util.Scanner;

public class BinaryTree {
	
	static Scanner sc= null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	static Node createNodeByNode()
	{
		sc= new Scanner(System.in);
		System.out.println("Enter first node: ");
		int data = sc.nextInt();
		if(data == -1) return null;
		Node root= new Node(data);
		
		System.out.println("enter left node of "+data+": ");
		root.left= createNodeByNode();
		
		System.out.println("enter right node of "+data+": ");
		root.right= createNodeByNode();
		
		return root;
	}
	
	
	static Node createBinaryTreeByArray()
	{
		Node root=null;
		int[] elements= new int[] {1,2,3,4,5,6,7,8,9};
		Node[] node=new Node[elements.length];
		
		for(int i=0;i<elements.length;i++)
		{
			node[i]= new Node(elements[i]);
		}
		
		for(int i=0;i<elements.length;i++)
		{
			node[i].left= ((2*i)+1)<=elements.length-1?node[(2*i)+1]:null;
			node[i].right= (2*(i+1))<=elements.length-1?node[2*(i+1)]:null;
		}
		root=node[0];
		return root;
	}
	
	
	static void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data);
			inOrder(root.right);
		}
	}
	
	static void preOrder(Node root)
	{
		if(root!=null)
		{	
			System.out.print(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	static void postOrder(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.data);
			postOrder(root.left);
			postOrder(root.right);
		}
	}
	
}
class Node
{
	Node left, right;
	int data;
	Node(int data)
	{
		this.data=data;
	}
}
