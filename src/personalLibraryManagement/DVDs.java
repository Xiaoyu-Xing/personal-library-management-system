/**
 * 
 */
package personalLibraryManagement;

/**
 * @author Xiaoyu
 *
 */
public class DVDs extends Publications{
	public int timeInMin;
	public int numberOfDVDs;
	public String cast;
	
	/**
	 * @param name
	 * @param ISBN
	 * @param publisher
	 * @param publicationYear
	 * @param purchasedYear
	 * @param contentType
	 * @param locationOnShelf
	 * @param timeInMin
	 * @param numberOfDVDs
	 * @param cast
	 */
	public DVDs(String name, String ASIN, String publisher, int publicationYear, int purchasedYear, String contentType,
			String locationOnShelf, int timeInMin, int numberOfDVDs, String cast) {
		super(name, ASIN, publisher, publicationYear, purchasedYear, contentType, locationOnShelf);
		this.timeInMin = timeInMin;
		this.numberOfDVDs = numberOfDVDs;
		this.cast = cast;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "For this DVD: timeInMin are: " + timeInMin + ", numberOfDVDs are: " + numberOfDVDs + ", "
				+ (cast != null ? "cast is: " + cast + ", " : "")
				+ "ASIN is: " + uniqueCode + ", " + (name != null ? "name is: " + name + ", " : "")
				+ "numberOfPossession is: " + numberOfPossession + ", "
				+ (publisher != null ? "publisher is: " + publisher + ", " : "") + "publicationYear is: " + publicationYear
				+ ", purchasedYear is: " + purchasedYear + ", "
				+ (contentType != null ? "contentType is: " + contentType + ", " : "")
				+ (locationOnShelf != null ? "locationOnShelf is: " + locationOnShelf + ", " : "") + "whether be deleted? "
				+ isDeleted + ", whether be borrowed? " + isBorrowed + ".";
	}
}
