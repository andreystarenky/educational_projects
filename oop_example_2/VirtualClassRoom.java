
public class VirtualClassRoom {
	public static void main(String[] args) {
		Student sdt0 = new Student("Alex");
		Student sdt1 = new Student("Bobby");
		Student sdt2 = new Student("Joe");
		Student sdt3 = new Student("Max");
		Locker lkr = new Locker(sdt1);
		/*System.out.println(lkr);
		System.out.println(sdt1.getNumber());
		System.out.println(sdt2.getNumber());
		System.out.println(sdt3.getNumber());
		System.exit(0);
		*/
		ClassRoom ics = new ClassRoom("ICS","Ms. Krasteva");  //Student is wearing Jacket
		ics.enterClassroom(sdt0);
		System.out.println("");
		ClassRoom music = new ClassRoom("Business","Ms. Osier"); //Student doesn't have music book
		music.enterClassroom(sdt1);
		System.out.println("");
		sdt2.putJacketAway();//Put jacket away
		sdt2.myLocker=null;  //Take away Locker
		ics.enterClassroom(sdt2);							  //Student doesn't have locker
		System.out.println("");
		sdt3.putJacketAway();//Put jacket away
		ics.enterClassroom(sdt3);							  //Student successfully enters
	}
}
