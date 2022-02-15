/*
 * Name: Justin Houle
 * Date: 2022/02/15
 * Description: The subclass "Lecturer" that extends the Superclass instructor.
 */
package Lab04B;

/**
 * The subclass "Lecturer" that extends the superclass "Instructor", and implements the method cope from it.
 */
public class Lecturer extends Instructor{

    /**
     * Constructor to initialize a new lecturer and the superclasses variables.
     *
     * @param age the integer value of the age of the Lecturer
     * @param unReadMail the intger value of current un read mail the lecturer may have
     */
    public Lecturer(int age, int unReadMail){
        super(age,unReadMail);
    }

    /**
     * This method implements cope from the superclass "Instructor" such that, the lecturer will delete 60% of his current unReadMail to cope.
     */
    public void cope(){
        this.reduceMail((int)(this.getUnReadMail() * 0.6));
    }
}
