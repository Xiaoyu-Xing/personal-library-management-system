/**
 * 
 */
package personalLibraryManagement;

/**
 * This is the single linked list for borrowing tracking systems.
 * @author Xiaoyu
 *
 */
public class LinkedList {
	private Link first;
	private int totalNumber; //total number
	private Tree myLibrary; //deliver the Tree instance
	/**
	 * This is the constructor for linked list
	 * @param myLibrary
	 */
	public LinkedList(Tree myLibrary) {
		first = null;
		totalNumber = 0;
		this.myLibrary = myLibrary; //deliver the Tree instance
	}
	/**
	 * This method is used to determine whether empty of the list.
	 * @return a boolean value. True if empty, false if not empty.
	 */
	public boolean isEmpty() {
		return first == null;//If no item, the first will still point to null.
	}
	public void insert(String name, String uniqueCode) {
		Link newLink = new Link(name, uniqueCode, myLibrary);
		
		if (isEmpty()) {//if empty list
			first = newLink;//first --> newlink due to this is the first one.
		}else {//if not empty
			newLink.next = first;//newLink --> old first
			first = newLink;//first --> newLink
		}
		totalNumber++;//increase the item number by one.
	}
	/**
	 * This is for getting the size of how many publications be borrowed
	 * This method prints out the item number of the list.
	 * 
	 */
	public int size() {
		return totalNumber;//return the number
	}
	/**
	 * This is for delete an entry from the linked list
	 * @param uniqueCode
	 */
	public void deleteByCode (String uniqueCode) {
		Link previous = first; //set previous pointer
		Link current = first; //set current pointer
		while (current != null) { //when not reaching the end, keep find
			if (current.uniqueCode ==  uniqueCode) { //if found the same code
				if (current == first) { // if located on the first position
					first = current.next; // set first to the next
				} else { //if not on the first
					previous.next = current.next; //set previous to the next one
				}
				break; //finish the deletion, break
			} else { //not found
				previous = current; //move previous to next
				current = current.next; //move current to the next
			}
		}
		totalNumber--; //reduce the number counting
	}
	/**
	 * This method is to use BUBBLE SORT method to rearrange the order of links in the linked list
	 * by alphabetical order of borrowers' name.
	 * Since there isn't many entry in the list, bubble sort is more than enough, no need to make
	 * things more complicated.
	 */
	public void sortByName() {
		//this is a bubble sorting method in the single linked list
		Link previous = first; //set pointer to start
		Link current = first;//set pointer to start
		for (int i = 0; i < totalNumber; i++) {
			//the outer loop to control how many cycles compairsons
			for (int j = 0; j < totalNumber-i-1; j++) {
				//inner loop to control the ending point of comparison
				if (current.name.compareTo(current.next.name) > 0) {
					//if the current one larger than the next one, need swap
					if (previous == current) { //if previous and current all point to first,
						//which is the initial case
						first = current.next; //fist --> the next (i.e. old second) one
						current.next = current.next.next; // the old first one --> the 3rd one
						first.next = current; //the old first one <-- the new first one
						previous = first; // now previous point to the new second one
						//so point to first again
					} else {
						//if previous and current not point to the same one,
						//which means current already move to the next one
						previous.next = current.next; //next <-- previous.next
						current.next = current.next.next; // the next.next <-- current.next
						previous.next.next = current;//the previous.next.next --> current
						previous = previous.next; //move the previous pointer to the next
						//after swap, the current pointer already moved on.
					} 
					//end swap
				}else {
					//if the current one smaller or equal to next one, swap, pointers move on
					previous = current; //move the previous pointer to next
					current = current.next; // move the current pointer to next
				} //end not swap
			}//end inner loop
			previous = first;//reset pointer to start
			current = first;//reset pointer to start
		}//end outer loop
	}//end bubble sort
	/**
	 * This method is for display the list.
	 */
	public void displayList() {
		if (!isEmpty()) {//if not empty
			System.out.println("List from first is: ");//show message
			Link current = first;//from first.
			while(current != null) {//until end
				current.displayLink();//display the current link.
				current = current.next;//move to the next link
			}
		}else {//if list empty
			System.out.println("List is empty.");//print error
		}
		System.out.println(" ");//separate an empty line
	}
}//end