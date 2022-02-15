/*
* Name: Justin Houle
* Date: 2022/02/15
* Description: The subclass "Grad" that extends the Superclass instructor.
*/
package Lab04B;

/**
 * A class grad which extends the superclass Instructor, who implements a method to cope with unread mail.
 */
public class Grad extends Instructor{

    /**
     * The constructor to initialize the class grad and the variables of the superclass instructor
     * @param age integer value of the age of the grad student
     * @param unReadMail the amount of unread mail the grad currently has
     */
    public Grad(int age, int unReadMail){
        super(age,unReadMail);
    }

    /**
     * Implements the method cope from the superclass Instructor, reads all mail at the cost of gaining
     * or losing eccentricities randomly
     */
    public void cope() {
        this.reduceMail(this.getUnReadMail());

        if((Math.random() < 0.5)){
         this.addToEccentricities(3);
        }
        else{
            this.removeToEccentricities(3);
        }

    }

    /**
     * Override for the stress method from the superclass "Instructor, the stress value of the grad is 1.5x times higher than the others.
     *
     * @return the new integer value for stress.
     *
     */
    @Override
    public int stress() {
        if (((this.getUnReadMail()) * 1.5) > 1500)
            return 1500;
        else {
            return (int)(this.getUnReadMail() * 1.5);
        }
    }
}
