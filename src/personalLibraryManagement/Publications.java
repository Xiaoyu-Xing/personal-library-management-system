/**
 * 
 */
package personalLibraryManagement;

/**
 * This is the abstract class publications, including all the necessary fields.
 * @author Xiaoyu
 *
 */
public abstract class Publications {
	public String uniqueCode;//ISBN for books, ASIN for CDs and DVDs
	public String name;//publication name
	public int numberOfPossession;//how many number he/she has
	public String publisher;//publisher
	public int publicationYear;
	public int purchasedYear;
	public String contentType;
	public String locationOnShelf;//where it located
	public boolean isDeleted;//whether be deleted
	public boolean isBorrowed;//whether be borrowed
	/**
	 * This is the constructor for publication.
	 * @param uniqueCode ISBN for books and ASIN for CDs and DVDs in string in string
	 * @param name title of this publication in string
	 * @param publisher publisher in string
	 * @param publicationYear four digits year, e.g. 2017
	 * @param purchasedYear four digits year, e.g. 2017
	 * @param contentType type or style of the content
	 * @param locationOnShelf where is located in string, e.g. 1A for book, 1B for CDs, 1C for DVDs
	 * @param isDeleted whether deleted
	 * @param isBorrowed whether be borrowed
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
		this.isDeleted = false;//default is false when just input to this database
		this.isBorrowed = false;//default is false when just input to this database
	}//end constructor
	
}//end publications abstract class
