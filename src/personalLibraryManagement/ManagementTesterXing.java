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
		//Below was commented for testing of BorrowTracking system to have whole list of publications to use.
//		myLibrary.deleteByCode("9780672324536");//delete one entry
//		myLibrary.deleteByCode("B0714QRG4Z");//delete one entry
//		myLibrary.traverse("Preorder");//see the preorder traversal
//		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		//Below for testing BorrowTracking system, and bubble sorting by name of the borrowing system
		BorrowTracking theBorrowedList = new BorrowTracking(myLibrary);// make new borrowTracking system
		theBorrowedList.anyBeBorrowed(); //anything be borrowed? 0
		theBorrowedList.borrow("Alex", "9780672324536"); //someone borrowed something
		theBorrowedList.borrow("Bob", "9780321573513");//someone borrowed something
		theBorrowedList.borrow("Dave", "B01LZHMGL4");//someone borrowed something
		theBorrowedList.borrow("Cathelina", "B01N5OKNQM");//someone borrowed something
		theBorrowedList.borrow("Fury", "B01MAZGLMP");//someone borrowed something
		theBorrowedList.borrow("Emma", "B0714QRG4Z");//someone borrowed something
		theBorrowedList.howManyBeBorrowed(); //how many be borrowed
		theBorrowedList.anyBeBorrowed();//anything be borrowed? 6
		theBorrowedList.displayBorrowedList();//display list
		theBorrowedList.sort();//bubble sort as alphabetical order of borrowers' name
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		theBorrowedList.displayBorrowedList();//display list
		theBorrowedList.returned("9780672324536");//something was returned
		theBorrowedList.returned("9780321573513");//something was returned
		theBorrowedList.returned("B01LZHMGL4");//something was returned
		theBorrowedList.returned("B01N5OKNQM");//something was returned
		theBorrowedList.returned("B01MAZGLMP");//something was returned
		theBorrowedList.returned("B0714QRG4Z");//something was returned
		theBorrowedList.howManyBeBorrowed();//how many be borrowed
		theBorrowedList.anyBeBorrowed();//anything be borrowed? 0
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		Books ochem = new Books("Organic Chemistry",  "9781118452288", "Wiley", 2013, 2014, "Chemistry", "5A", 1344, "David Klein");
		Books pchem = new Books("Physical Chemistry: Thermodynamics, Structure, and Change",  "9781429290197", "W. H. Freeman", 2014, 2016, "Chemistry", "5A", 1060, "Peter Atkins");
		Books achem = new Books("Analytical Chemistry: A Chemist and Laboratory Technician's Toolkit",  "9781118714843", "Wiley", 2015, 2015, "Chemistry", "5A", 680, "Bryan Ham");
		//insert all publications into tree
		myLibrary.insert(ochem);
		myLibrary.insert(pchem);
		myLibrary.insert(achem);
		myLibrary.size();//get size
		myLibrary.traverse("Preorder");//preorder traversal
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		System.out.println(ochem);
		theBorrowedList.borrow("Peter", "9781118452288"); //someone borrowed ochem
		System.out.println(ochem);
		theBorrowedList.returned("9781118452288");//ochem was returned
		System.out.println(ochem);
		System.out.println("--------------------------------------Seperate Line for Better Display---------------------------------------------");
		theBorrowedList.borrow("Peter", "9781118452288"); //someone borrowed ochem
		theBorrowedList.borrow("Adam", "9781429290197"); //someone borrowed pchem
		theBorrowedList.borrow("KK", "9781118714843"); //someone borrowed achem
		theBorrowedList.displayBorrowedList();//display list
		theBorrowedList.sort();//bubble sort as alphabetical order of borrowers' name
		theBorrowedList.displayBorrowedList();//display list
	}

}
