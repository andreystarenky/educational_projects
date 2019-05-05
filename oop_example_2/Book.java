/**
 * @author Andrey
 * April 22, 2019
 * Version 1.0
 * The Book class has multiple characteristics: Title and Course.
 * 				Variable Dictionary
 * Type			Name			Description
 * String		title			Book Title
 * String		course			Book Course
 */
public class Book
{
	private String title;
	private String course;
	
    /**Book Constructor
     * @param t
     * @param c
     */
    public Book(String t, String c)
    {
    	title=t;
    	course=c;
    }
    
    /**getTitle()
     * gets title
     * @return title
     */
    public String getTitle() {
		return title;
	}
    
    /**getCourse()
     * gets course
     * @return course
     */
	public String getCourse() {
		return course;
	}
	
	/**setTitle() 
	 * sets title
	 * @param thisTitle
	 */
	public void setTitle(String thisTitle)
    {
    	title=thisTitle;
    }
	
	/**setCourse()
	 * sets course
	 * @param thisCourse
	 */
    public void setCourse(String thisCourse)
    {
    	course=thisCourse;
    }
    
    public String toString()
    {
    	return title+" - "+course;
    }
    
} // Book class
