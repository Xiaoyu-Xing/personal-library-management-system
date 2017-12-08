/**
 * 
 */
package personalLibraryManagement;


/**
 * This is the subclass books extends publiation abstract class.
 * @author Xiaoyu
 *
 */
public class Books extends Publications {
	public int pages;//pages in this book
	public String author;//authors in string
	
	/**
	 * This is the constructor.
	 * @param name title of this publication in string
	 * @param ISBN ISBN for books and ASIN for CDs and DVDs in string in string
     * @param publisher publisher in string
	 * @param publicationYear four digits year, e.g. 2017
	 * @param purchasedYear four digits year, e.g. 2017
	 * @param contentType type or style of the content
	 * @param locationOnShelf where is located in string, e.g. 1A for book, 1B for CDs, 1C for DVDs
	 * @param pages how many pages 
	 * @param author author
	 */
	public Books(String name, String ISBN, String publisher, int publicationYear, int purchasedYear, String contentType,
			String locationOnShelf, int pages, String author) {
		super(name, author, ISBN, publisher, publicationYear, purchasedYear, contentType, locationOnShelf);//use super class's constructor
		this.pages = pages;
		this.author = super.author;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		//this is the output method
		return "For this book: pages are: " + pages + ", " + (author != null ? "author is: " + author + ", " : "")
				+ "ISBN is: " + uniqueCode + ", " + (name != null ? "name is: " + name + ", " : "")
				+ "numberOfPossession is: " + numberOfPossession + ", "
				+ (publisher != null ? "publisher is: " + publisher + ", " : "") + "publicationYear is: " + publicationYear
				+ ", purchasedYear is: " + purchasedYear + ", "
				+ (contentType != null ? "contentType is: " + contentType + ", " : "")
				+ (locationOnShelf != null ? "locationOnShelf is: " + locationOnShelf + ", " : "") + ", whether be borrowed? " + isBorrowed + ".\n";
	}//end toString
	
}//end books
