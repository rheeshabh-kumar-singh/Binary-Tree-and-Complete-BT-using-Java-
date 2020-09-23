# Binary Tree
This file contains codes to make a simple binary tree by 2 methods:
1. Node by Node:
  -This is a recursive method which creates BT by asking node data from user one by one and assign it to left or right child.
  -user can enter -1 for indicating Null value.
  ------------------------------------------------------------------------------
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
  ----------------------------------------------------------------------------------        





2. creating Complete Binary Tree:
  -In this method user can make a CBT by using array. Array index starts from 0.
  -the left child of the node is clculated by using (2*i)+1 since array index starts from 0.
  -the right child of the node is clculated by using 2*(i+1) since array index starts from 0.
  ----------------------------------------------------------------------------------
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
 -----------------------------------------------------------------------------------------
 
 
 
 
  Tree Traversals (Inorder, Preorder and Postorder)
  
  
  -----------------------------------------------------------------------------
  
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
-----------------------------------------------------------------------------------      
  
  
  Thanks for Visiting!!
  
  
