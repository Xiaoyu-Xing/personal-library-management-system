/**
 * 
 */
package personalLibraryManagement;


/**
 * @author Xiaoyu
 *
 */
public class Books extends Publications {
	public int pages;
	public String author;
	
	/**
	 * @param name
	 * @param ISBN
	 * @param publisher
	 * @param publicationYear
	 * @param purchasedYear
	 * @param contentType
	 * @param locationOnShelf
	 * @param pages
	 * @param author
	 */
	public Books(String name, String ISBN, String publisher, int publicationYear, int purchasedYear, String contentType,
			String locationOnShelf, int pages, String author) {
		super(name, ISBN, publisher, publicationYear, purchasedYear, contentType, locationOnShelf);
		this.pages = pages;
		this.author = author;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "For this book: pages are: " + pages + ", " + (author != null ? "author is: " + author + ", " : "")
				+ "ISBN is: " + uniqueCode + ", " + (name != null ? "name is: " + name + ", " : "")
				+ "numberOfPossession is: " + numberOfPossession + ", "
				+ (publisher != null ? "publisher is: " + publisher + ", " : "") + "publicationYear is: " + publicationYear
				+ ", purchasedYear is: " + purchasedYear + ", "
				+ (contentType != null ? "contentType is: " + contentType + ", " : "")
				+ (locationOnShelf != null ? "locationOnShelf is: " + locationOnShelf + ", " : "") + "whether be deleted? "
				+ isDeleted + ", whether be borrowed? " + isBorrowed + ".";
	}
	
}
