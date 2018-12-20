//Name: Mohamed Ameen Omar
//Student Number: u16055323
class Node<T> {
  public int value;
  public Node left;
  public Node right;

  public Node(int value)
	{
    this.value = value;
  }

}


public class BST
{
  public Node root;

  public BST insert(int value)
	{
  	Node node = new Node<>(value);
   	if (root == null)
	 	{
    	root = node;
   		return this;
  	}

 		insertRec(root, node);
 		return this;
	}

  private void insertRec(Node latestRoot, Node node)
	{
  	if (latestRoot.value > node.value)
		{
      if (latestRoot.left == null)
			{
          latestRoot.left = node;
    			return;
  		}
			else
			{
    			insertRec(latestRoot.left, node);
   		}
  	}

		else
		{
   		if (latestRoot.right == null)
			{
    		latestRoot.right = node;
     		return;
    	}
			else
			{
       	insertRec(latestRoot.right, node);
     	}
		}

  }

 // You Code for In-Order..... You should System.out.println(); to print your output
   public void printInorder()
	 {
		  if(this.root == null)
			{
				return;
			}

			else
			{
				System.out.println("Original Inorder");
				printInOrderRec(this.root);
				//Add a new line
				System.out.println("");


				Node mirrorRoot = mirrorTree(this.root);

				System.out.println("Mirror Inorder");
				this.printInOrderRec(mirrorRoot);
				System.out.println("");
			}

   }

	 //DONE
   private void printInOrderRec(Node currRoot)
	 {
		 if(currRoot != null)
		 {
			 printInOrderRec(currRoot.left);
			 System.out.print(currRoot.value + " ");
			 printInOrderRec(currRoot.right);
		 }

		 else
		 {
			 return;
		 }
   }



// You Code for PreOrder .... You should System.out.println(); to print your output
   public void printPreorder()
	 {
		 if(this.root == null)
		 {
			 return;
		 }

		 else
		 {
			 System.out.println("Original Preorder");
			 printPreOrderRec(this.root);
			 System.out.println("");

			 //mirror

			 //create a new tree
			 Node mirrorRoot = mirrorTree(this.root);


			 System.out.println("Mirror Preorder");
			 printPreOrderRec(mirrorRoot);
			 System.out.println("");
		 }
	 }


	 //DONE
   private void printPreOrderRec(Node currRoot)
	 {
			 if(currRoot != null)
			 {
				 System.out.print(currRoot.value + " ");
				 printPreOrderRec(currRoot.left);
				 printPreOrderRec(currRoot.right);
			 }

			 else
			 {
				 return;
			 }


	 }


// You Code for PostOrder .... You should System.out.println(); to print your output
   public void printPostorder()
	 {
		 if(this.root == null)
		 {
			 return;
		 }

		 else
		 {
			 System.out.println("Original Postorder");
			 this.printPostOrderRec(this.root);
			 System.out.println("");

			 //mirror

			Node mirrorRoot = mirrorTree(this.root);

			System.out.println("Mirror Postorder");
			printPostOrderRec(mirrorRoot);
			System.out.println("");


		 }

	 }


	 //DONE
   private void printPostOrderRec(Node currRoot)
	 {

		 	if(currRoot != null)
			{
				printPostOrderRec(currRoot.left);
				printPostOrderRec(currRoot.right);
				System.out.print(currRoot.value + " ");
			}

			else
			{
				return;
			}



   }

// Your code for Mirror .... You should System.out.println(); to print your output
    public Node mirrorTree(Node root)
		{
			if(root == null)
			{
				return null;
			}


		  else
			{
				//Create our new node
		    Node temp = new Node(root.value);
				//Make our right out left
				temp.right = mirrorTree(root.left);
				//make left our right
		    temp.left = mirrorTree(root.right);


		    return temp;
		  }

		}
}
