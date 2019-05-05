/**
 * @author Andrey
 * April 22, 2019
 * Version 1.0
 * The Jacket class has an owner characteristic.
 * 				Variable Dictionary
 * Type			Name			Description
 * Student 		owner			Owner
 */
public class Jacket
{
	private Student owner;

    /**Jacket()
     * Constructor that assigns ownership
     * @param me
     */
    public Jacket(Student me)
    {
    	owner=me;
    }

} // Jacket class
