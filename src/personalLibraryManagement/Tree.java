/**
 * 
 */
package personalLibraryManagement;
import java.util.*;//used for ArrayList

/**
 * This is the binary search tree class for publications objects
 * @author Xiaoyu
 *
 */
public class Tree {
	public Node root;//root of tree
	private int numberOfNodes;//number of node
	private List<Publications> pubArray = new ArrayList<Publications>();
	//this arraylist is for duplicate of this binary search tree for
	//searching based on non-key fields

	/**
	 * This is the constructor for tree class.
	 * @param root
	 */
	public Tree() {//constructor
		root = null;//set root to null
		numberOfNodes = 0;//set number to 0
	}
	public boolean isEmpty() {//whether empty?
		return root == null;//if root points to null then true, vice versa.
	}
	public int size() {//return number of nodes in tree
		System.out.println("The total number of entries is: "+numberOfNodes+".");
		return numberOfNodes;//return size
	}
	/**
	 * This method insert the node in to tree
	 * @param newPublication the publication instance to be inserted into the tree
	 */
	public void insert(Publications newPubliation) {//insert new node into tree
		numberOfNodes++; //increase item count by 1
		pubArray.add(newPubliation);
		Node newNode = new Node(newPubliation);//make new node 
		if (isEmpty()) {//if empty, 
			root = newNode;//refer root to new node
		} else {//not empty, find position to insert
			Node current = root;//pointer to find null position
			Node parent;//pointer to remember parent
			while (true) {//exit internally
				parent = current;//move parent to current before current move to next
				if (newNode.pub.uniqueCode.compareTo(current.pub.uniqueCode) < 0) {//if new node smaller
					current = current.left;//go left
					if (current == null) {//if current is empty
						parent.left = newNode;//refer new node here
						return;//exit
					}
				}else {//if new node bigger or equal
					current = current.right;//go right
					if (current == null) {//if current is empty
						parent.right = newNode;//refer new node here
						return;//exit
					}
				}//end else right
			}//end while
		}//end else not empty
	}//end insert
	/**
	 * This method find out the name by given names, if not found, return null
	 * @param uniqueCode is the either ISBN or ASIN for the unique code of books or CDs
	 * @return the node of the found ranks
	 */
	public Node searchByCode(String uniqueCode) {//find the node by uniqueCode
		if (isEmpty()) {//if empty
			System.out.println("Empty database.");//print empty tree message
			return null;
		}
		Node current = root;//start from root
		while (current.pub.uniqueCode != uniqueCode) {//when not found
			if (uniqueCode.compareTo(current.pub.uniqueCode) < 0 ) {//if smaller, 
				current = current.left;// go left
			}else {//otherwise,
				current = current.right;//go right
			}//end else
			if (current == null) {//if didn't find till no child
				System.out.println("Didn't find entry by code "+uniqueCode+".");//print not found message
				return null;//return null
			}//end not found
		}
		return current;//and return the node
	}//end find

	/**
	 * This method is for search by name of book or CD or DVD
	 * @param name the name of the item
	 */
	public void searchByName(String name) {
		List<Publications> searchResult = new ArrayList<Publications>();
		if (isEmpty()) {//empty?
		    System.out.println("Empty database.");//print empty tree message
		} else {//not empty
			for (Publications eachPub : pubArray) {//each entry in the arraylist
				if (eachPub.name.contains(name))//if contains the key searhcing for
						searchResult.add(eachPub);//add it to the result arraylist
			}
		}
		if (!searchResult.isEmpty()) {//if found
			for(Publications eachResult:searchResult) {//any item in the result arraylist
				System.out.println(eachResult.toString());//output
			}
		}else {//not found
			System.out.println("No Entry Found.");//print empty tree message
		}
	}
	/**
	 * This method is for search by author
	 * @param author the name of the publications
	 */
	public void searchByAuthor(String author) {
		List<Publications> searchResult = new ArrayList<Publications>();
		if (isEmpty()) {//empty?
		    System.out.println("Empty database.");//print empty tree message
		} else {
			for (Publications eachPub : pubArray) {//each entry in the arraylist
				if (eachPub.author.contains(author))//if contains the key searhcing for
						searchResult.add(eachPub);//add it to the result arraylist
			}
		}
		if (!searchResult.isEmpty()) {//if found
			for(Publications eachResult:searchResult) {//any item in the result arraylist
				System.out.println(eachResult.toString());//output
			}
		}else {
			System.out.println("No Entry Found.");//print empty tree message
		}
	}
	/**
	 * This method is for search by publisher
	 * @param publisher the name of publisher
	 */
	public void searchByPublisher(String publisher) {
		List<Publications> searchResult = new ArrayList<Publications>();
		if (isEmpty()) {//empty?
		    System.out.println("Empty database.");//print empty tree message
		} else {
			for (Publications eachPub : pubArray) {//each entry in the arraylist
				if (eachPub.publisher.contains(publisher))//if contains the key searhcing for
						searchResult.add(eachPub);//add it to the result arraylist
			}
		}
		if (!searchResult.isEmpty()) {//if found
			for(Publications eachResult:searchResult) {//any item in the result arraylist
				System.out.println(eachResult.toString());//output
			}
		}else {
			System.out.println("No Entry Found.");//print empty tree message
		}
	}

	/**
	 * This method is for search the publication by publication year
	 * @param year the year number in 4 digits
	 */
	public void searchByPublicationYear(int year) {
		List<Publications> searchResult = new ArrayList<Publications>();
		if (isEmpty()) {//empty?
		    System.out.println("Empty database.");//print empty tree message
		} else {
			for (Publications eachPub : pubArray) {//each entry in the arraylist
				if (eachPub.publicationYear == year)//if contains the key searhcing for
						searchResult.add(eachPub);//add it to the result arraylist
			}
		}
		if (!searchResult.isEmpty()) {//if found
			for(Publications eachResult:searchResult) {//any item in the result arraylist
				System.out.println(eachResult.toString());//output
			}
		}else {
			System.out.println("No Entry Found.");//print empty tree message
		}
	}
	/**
	 * This method is for search the publication by purchased year
	 * @param year the year number in 4 digits
	 */
	public void searchByPurchasedYear(int year) {
		List<Publications> searchResult = new ArrayList<Publications>();
		if (isEmpty()) {//empty?
		    System.out.println("Empty database.");//print empty tree message
		} else {
			for (Publications eachPub : pubArray) {//each entry in the arraylist
				if (eachPub.purchasedYear == year)//if contains the key searhcing for
						searchResult.add(eachPub);//add it to the result arraylist
			}
		}
		if (!searchResult.isEmpty()) {//if found
			for(Publications eachResult:searchResult) {//any item in the result arraylist
				System.out.println(eachResult.toString());//output
			}
		}else {
			System.out.println("No Entry Found.");//print empty tree message
		}
	}
	/**
	 * This method is for search the publication content type
	 * @param content the type of content
	 */
	public void searchContent(String content) {
		List<Publications> searchResult = new ArrayList<Publications>();
		if (isEmpty()) {//empty?
		    System.out.println("Empty database.");//print empty tree message
		} else {
			for (Publications eachPub : pubArray) {//each entry in the arraylist
				if (eachPub.contentType.contains(content))//if contains the key searhcing for
						searchResult.add(eachPub);//add it to the result arraylist
			}
		}
		if (!searchResult.isEmpty()) {//if found
			for(Publications eachResult:searchResult) {//any item in the result arraylist
				System.out.println(eachResult.toString());//output
			}
		}else {
			System.out.println("No Entry Found.");//print empty tree message
		}
	}
	/**
	 * This method is for search the publication by location
	 * @param location the string of location
	 */
	public void searchLocation(String location) {
		List<Publications> searchResult = new ArrayList<Publications>();
		if (isEmpty()) {//empty?
		    System.out.println("Empty database.");//print empty tree message
		} else {
			for (Publications eachPub : pubArray) {//each entry in the arraylist
				if (eachPub.locationOnShelf.contains(location))//if contains the key searhcing for
						searchResult.add(eachPub);//add it to the result arraylist
			}
		}
		if (!searchResult.isEmpty()) {//if found
			for(Publications eachResult:searchResult) {//any item in the result arraylist
				System.out.println(eachResult.toString());//output
			}
		}else {
			System.out.println("No Entry Found.");//print empty tree message
		}
	}
	/**
	 * this method delete the node with a uniqueCode, ISBN or ASIN
	 * @param uniqueCode is the key for the deletion
	 * @return
	 */
	public boolean deleteByCode(String uniqueCode){ // delete node with given uniqueCode
		if (isEmpty()) {//if empty
		    System.out.println("Empty database.");//print empty tree message
		    return false;//return false 
		}
		numberOfNodes--;//reduce 1 from the count
	   	Node current = root;//current pointer from root
	   	Node parent = root;//parent pointer
	   	boolean isleft = true;//whether on left of parent
	   	while(current.pub.uniqueCode != uniqueCode){// search for node
        parent = current;//set parent to root
        if(uniqueCode.compareTo(current.pub.uniqueCode) < 0){// go left?
            isleft = true;
            current = current.left;//left
        }
        else {// or go right?
            isleft = false;
            current = current.right;
        }
        if(current == null)// end of the line,
            return false;// didn't find it
        }  // end while
	   	// found node to delete
	   	// if no children, simply delete it
	   	if(current.left==null && current.right==null){
	        if(current == root)// if root,
	        	root = null; // tree is empty
	        else if(isleft)
	        	parent.left = null;// disconnect from parent
	        else
	        	parent.right = null;
        }
      // if no right child, replace with left subtree
	   	else if(current.right==null) {
	   		if(current == root)
	   			root = current.left;
	   		else if(isleft)
	   			parent.left = current.left;
	   		else
	   			parent.right = current.left;
	   	}
      // if no left child, replace with right subtree
	   	else if(current.left==null) {
	   		if(current == root)
	   			root = current.right;
	   		else if(isleft)
	   			parent.left = current.right;
	   		else
	   			parent.right = current.right;
	   	}
	   	else{// two children, so replace with inorder successor
         // get successor of node to delete (current)
        Node successor = getSuccessor(current);
         // connect parent of current to successor instead
         	if(current == root)
         		root = successor;
         	else if(isleft)
         		parent.left = successor;
         	else
         		parent.right = successor;
         // connect successor to current's left child
        successor.left = current.left;
         }  // end else two children
	   	// (successor cannot have a left child)
	   	return true;        
      } // end delete()
   // returns node with next-highest value after delNode
   // goes to right child, then right child's left descendents
	/**
	 * This method get the successor for the deleted node
	 * @param delNode the node to be deleted
	 * @return the successor node
	 */
	private Node getSuccessor(Node delNode){
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.right;   // go to right child
		while(current != null){// until no more left children,
			successorParent = successor;
			successor = current;
			current = current.left;      // go to left child
        }
		if(successor != delNode.right){  // if successor not right child,make connections
			successorParent.left = successor.right;
			successor.right = delNode.right;
        }
		return successor;
	}
	/**
	 * This method changes the field isBorrowed in Publication class to show whether borrowed
	 * @param uniqueCode the ISBN for books and ASIN for CDs and DVDs
	 */
	public void borrowByCode(String uniqueCode) {
		Node theBorrowed = searchByCode(uniqueCode);//search for the publication
		theBorrowed.pub.isBorrowed = true;//changed to borrowed
	}
	
	/**
	 * This method changed the status of some publications to not borrowed 
	 * @param uniqueCode
	 */
	public void returnByCode(String uniqueCode) {
		Node theBorrowed = searchByCode(uniqueCode);//search for the publication
		theBorrowed.pub.isBorrowed = false;//changed to not borrowed
	}
	/**
	 * traverse in order: Inorder, Preorder, or Postorder
	 * @param order
	 */
	public void traverse(String order){
    switch(order)
       {
       case "Preorder": System.out.print("\nPreorder traversal:\n");
               traversePre(root);//go preorder
               break;
       case "Inorder": System.out.print("\nInorder traversal:\n");
               traverseIn(root);//go inorder
               break;
       case "Postorder": System.out.print("\nPostorder traversal:\n");
               traversePost(root);//go postorder
               break;
       }
    }
	/**
	 * traverse in in order
	 * @param aNode starting node
	 */
	private void traverseIn(Node aNode){
		if(aNode != null) {//if not end
			traverseIn(aNode.left);//go left
			aNode.displayNode();//display
			traverseIn(aNode.right);//go right
		}
	}
	/**
	 * traverse in pre order
	 * @param aNode starting node
	 */
	private void traversePre(Node aNode){
		if(aNode != null) {//if not end
			aNode.displayNode();//display
			traversePre(aNode.left);//go left
			traversePre(aNode.right);//go right
		}
	}
	/**
	 * traverse in post order
	 * @param aNode starting node
	 */
	private void traversePost(Node aNode){
		if(aNode != null) {//if not end
			traversePost(aNode.left);//go left
			traversePost(aNode.right);//go right
			aNode.displayNode();//display
		}
	}
}
