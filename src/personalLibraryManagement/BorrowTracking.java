/**
 * 
 */
package personalLibraryManagement;

/**
 * This is the contoller of the BorrowTracking system, powered by LinkedList
 * @author Xiaoyu
 *
 */
public class BorrowTracking {
	private LinkedList theBorrowed; //declare new linked list
	private Tree myLibrary; //deliver the Tree instance
	/**
	 * This is the constructor of the BorrowTacking system
	 * @param myLibrary need to use the Tree class to read the detailed information
	 */
	public BorrowTracking(Tree myLibrary) {
		theBorrowed = new LinkedList(myLibrary); //make new linked list
		this.myLibrary = myLibrary;
	}
	/**
	 * This method is to show whether anything be borrowed
	 */
	public void anyBeBorrowed() {
		if (theBorrowed.isEmpty() == true) { //if nothing borrowed
			System.out.println("Nothing got borrowed");
		} else { //something borrowed
			System.out.println("Something got borrowed");
		}
	}
	/**
	 * This method prints how many things are borrowed
	 */
	public void howManyBeBorrowed() {
		System.out.println("Number of total borrowed is "+theBorrowed.size()+".");
	}
	/**
	 * This method is to set the publication to be returned
	 * @param uniqueCode
	 */
	public void returned(String uniqueCode) {
		theBorrowed.deleteByCode(uniqueCode); //remove from Borrowing system
		myLibrary.returnByCode(uniqueCode); //set publication to be not borrowed
	}
	
	/**
	 * This method is to set the publication to be borrowed.
	 * @param name who borrowed this, need to be a string.
	 * @param uniqueCode what is the code, ISBN or ASIN of the publication, 
	 */
	public void borrow(String name, String uniqueCode) {
		theBorrowed.insert(name, uniqueCode); //add the info to borrow tracking system
		myLibrary.borrowByCode(uniqueCode); //set publication to be borrowed
	}
	/**
	 * This method is to sort the borrow tracking system information by the alphabetical order of name
	 */
	public void sort() {
		theBorrowed.sortByName();
	}
	/**
	 * This is to display the borrowed list information.
	 */
	public void displayBorrowedList() {
		theBorrowed.displayList();
	}
}//end 
