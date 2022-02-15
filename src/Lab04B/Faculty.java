/*
 * Name: Justin Houle
 * Date: 2022/02/15
 * Description: The subclass "Faculty" that extends the Superclass instructor.
 */
package Lab04B;

/**
 * The subclass "Faculty" that extends the superclass "Instructor", and implements the method cope from it.
 */
public class Faculty extends Instructor{

    /**
     * The constructor which initializes a new faculty member and the variables from its' superclass
     * @param age the integer value of the age of the faculty member
     * @param unReadMail the integer value of unread mail the new faculty member may have.
     */
    public Faculty(int age, int unReadMail){
    super(age,unReadMail);
    }

    /**
     * Method that implements cope from the superclass "Instructor" such that, the eccentricities increase by 30 everytime they cope.
     */
    public void cope(){
        this.addToEccentricities(30);
    }

    /**
     * An override of the method "respect()" from the superclass "Instructor" such that, the respect increases the more eccentricities the faculty member has
     * @return the integer value of respect
     */
    @Override
    public int respect(){
    return (this.getAge() + this.getEccentricities());
    }

}
