/**
 * 
 */
package personalLibraryManagement;

/**
 * @author Xiaoyu
 *
 */
public class ManagementTesterXing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//make new instances for books, CDs, and DVDs
		Books dataStructures = new Books("Data Structures and Algorithms in Java",  "9780672324536", "Sams Publishing", 2002, 2017, "Computer Technology", "1A", 800, "Robert Lafore");
		Books algorithms = new Books("Algorithms",  "9780321573513", "Addison-Wesley Professional", 2011, 2017, "Computer Technology", "1A", 992, "Robert Sedgewick");
		CDs chrismas1 = new CDs("A Pentatonix Christmas", "B01LZHMGL4", "Import", 2016, 2016, "Pop Music", "1B", 34, 1, "Pentatonix");
		CDs concertos1 = new CDs("Mozart/ Rachmaninov: Concertos/ A Conversation that Never Was", "B01N5OKNQM", "Deutsche Grammophon", 2017, 2017, "Classical Music", "1B", 50, 2, "Grigory Sokolov (Artist), Mozart (Composer), Rachmaninov (Composer)");
		DVDs wonderWoman = new DVDs("Wonder Woman 2017", "B0714QRG4Z", "WarnerBrothers", 2017, 2017, "Super Heroes", "1C", 133, 2, "Gal Gadot (Actor), Chris Pine (Actor), Patty Jenkins (Director, Writer)");
		DVDs moana = new DVDs ("Moana", "B01MAZGLMP", "Walt Disney Studios Home Entertainment", 2017, 2017, "Animation", "1C", 107, 2, " Auli'i Cravalho (Actor), Dwayne Johnson (Actor), Ron Clements (Director)"); 
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");//serve as a line for a clearer display
		//test the class of publications and its child classes and display method
		System.out.println(dataStructures);
		System.out.println(algorithms);
		System.out.println(chrismas1);
		System.out.println(concertos1);
		System.out.println(wonderWoman);
		System.out.println(moana);
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		//test the binary search tree
		Tree myLibrary = new Tree();//make new tree
		//insert all publications into tree
		myLibrary.insert(dataStructures);
		myLibrary.insert(algorithms);
		myLibrary.insert(chrismas1);
		myLibrary.insert(concertos1);
		myLibrary.insert(wonderWoman);
		myLibrary.insert(moana);
		myLibrary.traverse("Preorder");//preorder traversal
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		myLibrary.size();//get size
		System.out.println("Empty?"+myLibrary.isEmpty());//whether empty
		System.out.println("Search result for " + "B0714QRG4Z is: " + myLibrary.searchByCode("B0714QRG4Z").pub.toString());//get result for searching for ISBN
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		System.out.print("Search result for containing author \"Robert Lafore\" is: ");
		myLibrary.searchByAuthor("Robert Lafore");//get result for searching for author
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		System.out.print("Search result for containing name \"Algorithms\" is: ");
		myLibrary.searchByName("Algorithms");//get result for searching for name
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		System.out.print("Search result for containing publication year \"2011\" is: ");
		myLibrary.searchByPublicationYear(2011);//get result for searching for containing publication year 2011
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		System.out.print("Search result for containing purchased year \"2017\" is: ");
		myLibrary.searchByPurchasedYear(2017);//get result for searching for containing purchased year 2011
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		System.out.print("Search result for containing content \"Computer Technology\" is: ");
		myLibrary.searchContent("Computer Technology");//get result for searching for containing content 
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		System.out.print("Search result for containing location \"1A\" is: ");
		myLibrary.searchLocation("1A");//get result for searching for containing location 
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		myLibrary.borrowByCode("B01MAZGLMP");//test for borrow method
		System.out.println(moana);//check the isBorrowed field changed to true.
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		myLibrary.deleteByCode("9780672324536");//delete one entry
		myLibrary.deleteByCode("B0714QRG4Z");//delete one entry
		myLibrary.traverse("Preorder");//see the preorder traversal
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		
		
	}

}
