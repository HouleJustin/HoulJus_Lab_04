/*
 * Name: Justin Houle
 * Date: 2022/02/15
 * Description: Overrides the compare method from the "Comparator" superclass
 */
package Lab04A;
import java.util.Comparator;

/**
 * A class which Implements the "Comparator" class and overrides the compare method from it.
 */
public class AgeComparator implements Comparator<Person>{
    /**
     * The override of the compare class, taking the difference of 2 objects and not comparing their location.
     * @param o1 the class person
     * @param o2 the class person
     * @return the integer value between the age of person 1 (o1) and person 2 (o2)
     */
    @Override
    public int compare(Person o1, Person o2) {
        return ((o1.getAge()) - (o2.getAge()));
    }
}
