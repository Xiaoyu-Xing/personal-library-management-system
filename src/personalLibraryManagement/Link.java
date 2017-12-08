/**

 * 
 */
package personalLibraryManagement;

/**
 * The link used for linked list.
 * @author Xiaoyu
 *
 */
public class Link {
	public String name; //who borrowed the publication
	public String uniqueCode; //what is the ISBN or ASIN code
	public Link next; //link to next
	public Publications borrowed; //used to get the full information of publications
	/**
	 * This is the constructor to build the link.
	 * @param name the borrower's name
	 * @param uniqueCode the ISBN or ASIN of the publication
	 * @param myLibrary the tree of the library database
	 */
	public Link(String name, String uniqueCode, Tree myLibrary) {
		this.name = name; //set name
		this.uniqueCode = uniqueCode; //set unique code
		this.borrowed = myLibrary.searchByCode(uniqueCode).pub; //retrieve the detailed info
	}
	/**
	 * display the link
	 */
	public void displayLink() {
		System.out.println("Your friend "+name+" borrowed: "+borrowed.toString());
	}
}//end 
