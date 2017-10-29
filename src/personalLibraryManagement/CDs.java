/**
 * 
 */
package personalLibraryManagement;

/**
 * @author Xiaoyu
 *
 */
public class CDs extends Publications{
	public int timeInMin;
	public int numberOfCDs;
	public String player;


	/**
	 * @param name
	 * @param ISBN
	 * @param publisher
	 * @param publicationYear
	 * @param purchasedYear
	 * @param contentType
	 * @param locationOnShelf
	 * @param timeInMin
	 * @param numberOfCDs
	 * @param player
	 */
	public CDs(String name, String ASIN, String publisher, int publicationYear, int purchasedYear, String contentType,
			String locationOnShelf, int timeInMin, int numberOfCDs, String player) {
		super(name, ASIN, publisher, publicationYear, purchasedYear, contentType, locationOnShelf);
		this.timeInMin = timeInMin;
		this.numberOfCDs = numberOfCDs;
		this.player = player;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "For this CD: timeInMin are: " + timeInMin + ", numberOfCDs are: " + numberOfCDs + ", "
				+ (player != null ? "player is: " + player + ", " : "")
				+ "ASIN is: " + uniqueCode + ", " + (name != null ? "name is: " + name + ", " : "")
				+ "numberOfPossession is: " + numberOfPossession + ", "
				+ (publisher != null ? "publisher is: " + publisher + ", " : "") + "publicationYear is: " + publicationYear
				+ ", purchasedYear is: " + purchasedYear + ", "
				+ (contentType != null ? "contentType is: " + contentType + ", " : "")
				+ (locationOnShelf != null ? "locationOnShelf is: " + locationOnShelf + ", " : "") + "whether be deleted? "
				+ isDeleted + ", whether be borrowed? " + isBorrowed + ".";
	}
}
