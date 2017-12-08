/**
 * 
 */
package personalLibraryManagement;

/**
 * This is the subclass DVDs extends publiation abstract class.
 * @author Xiaoyu
 *
 */
public class DVDs extends Publications{
	public int timeInMin;//how long for this DVDs to play
	public int numberOfDVDs;//how many discs
	public String cast;//cast name in string
	
	/**
	 * This is the constructor.
	 * @param name title of this publication in string
	 * @param ASIN ASIN for books and ASIN for CDs and DVDs in string in string
     * @param publisher publisher in string
	 * @param publicationYear four digits year, e.g. 2017
	 * @param purchasedYear four digits year, e.g. 2017
	 * @param contentType type or style of the content
	 * @param locationOnShelf where is located in string, e.g. 1A for book, 1B for CDs, 1C for DVDs
	 * @param timeInMin how long for this CDs to play in minutes
	 * @param numberOfDVDs how many discs
	 * @param cast players name in string
	 */
	public DVDs(String name, String ASIN, String publisher, int publicationYear, int purchasedYear, String contentType,
			String locationOnShelf, int timeInMin, int numberOfDVDs, String cast) {
		super(name, cast, ASIN, publisher, publicationYear, purchasedYear, contentType, locationOnShelf);
		this.timeInMin = timeInMin;
		this.numberOfDVDs = numberOfDVDs;
		this.cast = super.author;
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
				+ (locationOnShelf != null ? "locationOnShelf is: " + locationOnShelf + ", " : "") + ", whether be borrowed? " + isBorrowed + ".\n";
	}//end toString
}
//end DVDs