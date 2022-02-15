/*
 * Name: Justin Houle
 * Date: 2022/02/15
 * Description: The class "Person" is used to describe a persons name and age
 */

package Lab04A;
import java.util.Comparator;

/**
 * A class used to describe a person
 */
public class Person {
    private int age;
    private String name;


    //constructor

    /**
     * Constructor to initialize a new person
     * @param Age the integer value of age of the perosn
     * @param Name the string name of the person
     */
    public Person(int Age, String Name){
        this.age = Age;
        this.name = Name;
    }

    //Getters
    /**
     * Makes the private variable age value accessible.
     * @return the age of the person
     */
    public int getAge(){
        return age;
    }

    /**
     * Makes the private variable name string accessible.
     * @return the String name of the person
     */
    public String getName(){
        return name;
    }

    /**
     * Overrides the toString method to print the name and age of any person and not the location of name and age.
     * @return the String of the persons name and age.
     */
    @Override
    public String toString(){
        return String.format("Name: %s Age: %s", name, age);

    }

}
