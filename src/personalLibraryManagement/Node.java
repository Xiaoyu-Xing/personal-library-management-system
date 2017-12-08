/**
 * 
 */
package personalLibraryManagement;

/**
 * This is the Node class for the binary search tree.
 * @author Xiaoyu
 *
 */
public class Node {
	Publications pub;//the publications field to store related information
	public Node left;//left child
	public Node right;//right child
	/**
	 * The constructor method for making new node.
	 * @param newPublication the Publications object
	 */
	public Node(Publications newPublication) {
		pub = newPublication;
		left = null;//default to null
		right = null;//defalt to null
	}
	/**
	 * DisplayNode is to show all the information store in the node
	 */
	public void displayNode() {
		System.out.println(pub.toString());//display the node information
	}
}
