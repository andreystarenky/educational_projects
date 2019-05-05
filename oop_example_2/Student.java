// The "Student" class.

/**
 * @author Andrey
 * April 22, 2019
 * Version 1.0
 * The Student class has multiple characteristics: Student number, name, locker, jacket, and books.
 * The Student class has a behavior putJacketAway()
 * 				Variable Dictionary
 * Type			Name			Description
 * int			number			Individual Student Number
 * String		name			Student Name
 * Locker		myLocker		Student's Locker
 * Jacket		myJacket		Student's Jacket
 * Book[]		books			Student's books
 * int(static)  num				Global Student Number
 */
public class Student
{
	private int number;		  //Student #
	private String name;	  //Name
	public Locker myLocker;  //Locker  PUBLIC so that you can directly change from client IF NEEDED
	private Jacket myJacket;  //Jacket
	private Book books[];	  //Books
	private static int num=1; //Static student # (increases for every new student)
    
    /**
     * Constructor
     * Creates student, assigns name, number, locker, and jacket
     * @param String myName - name of the student
     */
    public Student(String myName)
    {
    	name = myName;
    	number = num++;
    	myLocker=new Locker(this);
    	myJacket=myLocker.getJacket();
    	books=myLocker.getBooks();
    }

    /**
     * This method gets called when the student is sent to the office
     */
    public void sentToOffice(String reason)
    {
    	System.out.println(name+ " was sent to the office: "+reason);
    }

    /** 
     * Display student information
     */
     public String toString()
     {
    	 return name;
     }
     
     /**getNumber()
      * Returns student number
      * @return number
      */
     public int getNumber() {
    	 return number;
     }
     /**getLocker()
      * Returns locker
      * @return myLocker
      */
     public Locker getLocker() {
    	 return myLocker;
     }
     
     /**getJacket
      * Returns jacket
      * @return myJacket
      */
     public Jacket getJacket() {
    	 return myJacket;
     }
     
     /**putJacketAway()
      * Puts myJacket away by assigning it to the locker and then setting value to null
      */
     public void putJacketAway() {
    	 myLocker.putJacket(myJacket);
    	 myJacket=null;
    	 System.out.println(name+ " put his/her jacket away");
     }
     
     /**hasBook()
      * Checks for a book with a specific course
     * @param course
     * @return
     */
    public boolean hasBook(String course) {
    	 for(Book b:books) {
    		 if(b.getCourse().equals(course))
    			 return true;
    	 }
    	 return false;
     }
    
} // Student class
