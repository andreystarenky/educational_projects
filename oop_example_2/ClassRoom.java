/**
 * @author Andrey
 * April 22, 2019
 * Version 1.0
 * The ClassRoom class has multiple characteristics: course and teacher.
 * 				Variable Dictionary
 * Type			Name			Description
 * String		course			Course of this Class
 * String		teacher			Teacher of the Class
 */
public class ClassRoom {

	String course;
	String teacher;
	
	/**ClassRoom
	 * Constructor, assigns teacher and course
	 * @param thisCourse
	 * @param thisTeacher
	 */
	public ClassRoom(String thisCourse, String thisTeacher) {
		course=thisCourse;
		teacher=thisTeacher;
	}
	
	/**enterClassroom()
	 * Simulates student entering into class
	 * @param enterStudent
	 */
	public boolean enterClassroom(Student enterStudent) {
		System.out.println(enterStudent + " came into "+course+" class taught by "+teacher+".");
		if(enterStudent.getLocker()==null) {
			enterStudent.sentToOffice("Student needs a locker");
			return false;
		}
		if(!enterStudent.hasBook(course)) {
			enterStudent.sentToOffice("Student doesn't have necessary books");
			return false;
		}			
		if(!enterStudent.getLocker().checkJacket()) {			
			System.out.println(enterStudent + " needs to put his jacket away");
			enterStudent.putJacketAway();
			return false;
		}
		return true;
	}
	
}
