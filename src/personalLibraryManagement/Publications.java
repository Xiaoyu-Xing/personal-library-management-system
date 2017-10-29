/**
 * 
 */
package personalLibraryManagement;

/**
 * @author Xiaoyu
 *
 */
public abstract class Publications {
	public String uniqueCode;//ISBN for books, ASIN for CDs and DVDs
	public String name;
	public int numberOfPossession;
	public String publisher;
	public int publicationYear;
	public int purchasedYear;
	public String contentType;
	public String locationOnShelf;
	public boolean isDeleted;
	public boolean isBorrowed;
	/**
	 * @param uniqueCode
	 * @param name
	 * @param numberOfPossession
	 * @param publisher
	 * @param publicationYear
	 * @param purchasedYear
	 * @param contentType
	 * @param locationOnShelf
	 * @param isDeleted
	 * @param isBorrowed
	 */
	public Publications(String name, String uniqueCode, String publisher, int publicationYear,
			int purchasedYear, String contentType, String locationOnShelf) {
		super();
		numberOfPossession = 1;
		this.uniqueCode = uniqueCode;
		this.name = name;
		this.publisher = publisher;
		this.publicationYear = publicationYear;
		this.purchasedYear = purchasedYear;
		this.contentType = contentType;
		this.locationOnShelf = locationOnShelf;
		this.isDeleted = false;
		this.isBorrowed = false;
	}
	
	
}
