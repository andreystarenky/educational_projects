/**
 * @author Andrey
 * April 22, 2019
 * Version 1.0
 * The Locker class has multiple characteristics: Title and Course.
 * 				Variable Dictionary
 * Type			Name			Description
 * int			number			Locker number
 * Student		owner			Locker owner
 * Jacket		studentJacket	Student's Jacket
 * Book[]		books			Books
 */
public class Locker
{
	private int number;
    private Student owner;
    private Jacket studentJacket;
    private Book books[];
    
    /**
     * Default constructor
     * @param me
     */
    public Locker(Student me)
    {
    	owner=me;
    	number=(int)(Math.random()*1600)+1;//Assuming 1600 lockers
    	books= new Book[] {new Book("Barron's AP","ICS"),new Book("Nelson","Math"),new Book("Pearson","Science"),new Book("Lord of the Flies","English")};
    	studentJacket = new Jacket(owner);
    }
    
    /**getJacket()
     * gets jacket
     * @return studentJacket
     */
    public Jacket getJacket()
    {
    	Jacket jacket=studentJacket;
    	studentJacket=null;
    	return jacket;
    }

    /**checkJacket()
     * Checks for Jacket in locker
     * @return studentJacket (if jacket is not there, value is null)
     */
    public boolean checkJacket()
    {
    	if(studentJacket==null)
    		return false;
    	return true;
    }

    /**putJacket()
     * Puts jacket in locker
     * @param myJacket
     */
    public void putJacket(Jacket myJacket)
    {
    	studentJacket=myJacket;
    }
    
    /**assignOwner()
     * Assigns Owner to Locker
     * @param me
     */
    public void assignOwner(Student me)
    {
    	owner=me;
    }
    
    /**toString()
     * Returns Locker (#) belongs to (owner)
     */
    public String toString()
    {
    	return "Locker "+number+" belongs to "+owner;
    }
    
    /**getBooks
     * Returns Books
     * @return books
     */
    public Book[] getBooks() {
    	return books;
    }
    
} // Locker class
