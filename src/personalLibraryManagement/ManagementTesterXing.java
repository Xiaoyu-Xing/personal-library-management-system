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
		Books dataStructures = new Books("Data Structures and Algorithms in Java",  "9780672324536", "Sams Publishing", 2002, 2017, "Computer Technology", "1A", 800, "Robert Lafore");
		Books algorithms = new Books("Algorithms",  "9780321573513", "Addison-Wesley Professional", 2011, 2017, "Computer Technology", "1A", 992, "Robert Sedgewick");
		CDs chrismas1 = new CDs("A Pentatonix Christmas", "B01LZHMGL4", "Import", 2016, 2016, "Pop Music", "1B", 34, 1, "Pentatonix");
		CDs concertos1 = new CDs("Mozart/ Rachmaninov: Concertos/ A Conversation that Never Was", "B01N5OKNQM", "Deutsche Grammophon", 2017, 2017, "Classical Music", "1B", 50, 2, "Grigory Sokolov (Artist), Mozart (Composer), Rachmaninov (Composer)");
		DVDs wonderWoman = new DVDs("Wonder Woman 2017", "B0714QRG4Z", "WarnerBrothers", 2017, 2017, "Super Heroes", "1C", 133, 2, "Gal Gadot (Actor), Chris Pine (Actor), Patty Jenkins (Director, Writer)");
		DVDs moana = new DVDs ("Moana", "B01MAZGLMP", "Walt Disney Studios Home Entertainment", 2017, 2017, "Animation", "1C", 107, 2, " Auli'i Cravalho (Actor), Dwayne Johnson (Actor), Ron Clements (Director)"); 
		System.out.println(dataStructures.uniqueCode.compareTo(chrismas1.uniqueCode));
		System.out.println(dataStructures);
		System.out.println(algorithms);
		System.out.println(chrismas1);
		System.out.println(concertos1);
		System.out.println(wonderWoman);
		System.out.println(moana);
		
	}

}
