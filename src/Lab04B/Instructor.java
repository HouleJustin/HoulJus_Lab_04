/*
 * Name: Justin Houle
 * Date: 2022/02/15
 * Description: The superclass Instructor which defines the amount of stress any instructor might have due to the unread mail
 */
package Lab04B;
import java.lang.Math;

/**
 * The superclass instructor which will be extended by further subclasses
 */
public abstract class Instructor{
    private final int age;
    private int unReadMail;
    private int eccentricities;

    /**
     * Constructor of the Instructor class
     *
     * @param Age the integer value of the Instructors age.
     * @param unReadMail the integer value which contains the value of unread mail an instructor has
     */
    public Instructor(int Age, int unReadMail){
        this.age = Age;
        this.unReadMail = unReadMail;
    }

    //getters

    /**
     * Gives access to the value of the private variable age
     *
     * @return the value of the private variable age
     */
    public int getAge(){
       return this.age;
    }

    /**
     * Gives access to the value of the private variable unReadMail
     *
     * @return the value of the private variable unReadMail
     */
    public int getUnReadMail(){
        return this.unReadMail;
    }

    /**
     * Gives access to the value of the private variable eccentricities
     *
     * @return the value of the private variable eccentricities
     */
    public int getEccentricities(){
        return this.eccentricities;
    }

    //abstract method cope

    /**
     * Method for the subclasses that extend Instructor to implement when called
     */
    abstract void cope();

    /**
     * Calculates a stress value depending on the value of unReadMail. The stress value is capped at 1000
     *
     * @return tan integer stress value
     */
    public int stress(){
        int stress = getUnReadMail();
        if(stress > 1000){
            return 1000;
        }
        else
            return stress;
    }

    /**
     * Calculates a respect value depending on the age and the eccentricities
     *
     * @return an integer value of respect
     */
    public int respect(){
        if((getAge() - getEccentricities()) < 0){
            return 0;
        }
        else
            return (getAge() - getEccentricities());
    }

    /**
     * This method decreases the amount on unReadMail depending on the amount of mail read
     *
     * @param readMail the amount of mail you read from you unread mail
     */
    public void reduceMail(int readMail){
        this.unReadMail = this.unReadMail - readMail;
        if(this.unReadMail < 0){
            this.unReadMail = 0;
        }
    }

    /**
     * Increases the value of the private variable depending on the parameter eccentricities
     *
     * @param eccentricities the amount of eccentricities that are added to the private variable eccentricities
     */
    public void addToEccentricities(int eccentricities){
        this.eccentricities = this.eccentricities + eccentricities;
        if(this.eccentricities < 0){
            this.eccentricities = 0;
        }
    }

    /**
     * The method to decreas the value of the private variable eccentricities
     *
     * @param eccentricities the integer value of the amount that the private variable "eccentricities" will be decreased by
     */
    public void removeToEccentricities(int eccentricities){
        this.eccentricities = this.eccentricities - eccentricities;
        if(this.eccentricities < 0){
            this.eccentricities = 0;
        }
    }

    /**
     * The method which increases the amount of unread mail an instructor has, and randomly increases or decreases the eccentricities.
     *
     * @param newMail the value which will increase the value of the private variable unReadMail
     */
    public void getMail(int newMail){
        this.unReadMail = this.unReadMail + newMail;
        if((Math.random() < 0.2)){
            if((Math.random()<0.5)){
                this.eccentricities = this.eccentricities + 2;
            }
            else{
                this.eccentricities = this.eccentricities - 2;
            }
        }

        if(this.eccentricities < 0){
            this.eccentricities = 0;
        }

        if(stress() > respect()){
            cope();
        }

    }
}
