/*
 * Name: Justin Houle
 * Date: 2022/02/15
 * Description: Overrides the compare method from the "Comparator" superclass
 */
package Lab04A;
import java.util.Comparator;

/**
 * Overrides the compare method from the "Comparator" superclass to find the difference in integer value of their names
 */
public class LexicographicComparator implements Comparator<Person>{

    /**
     * Finds the integer value between the differenc of the names of the inputted objects.
     * @param o1 person 1
     * @param o2 person 2
     * @return the integer value of the difference between the names of 2 people.
     */
    @Override
    public int compare(Person o1, Person o2) {

        String Name1 = o1.getName();
        String Name2 = o2.getName();

        for(int i = 0; i < Name1.length() && i < Name2.length(); i++) {
            if ((int) Name1.charAt(i) == (int) Name2.charAt(i)) {
                continue;
            } else {
                return (int) Name1.charAt(i) - (int) Name2.charAt(i);
            }
        }

        if(Name1.length() < Name2.length()){
            return Name1.length() - Name2.length();
        }
        else if(Name1.length() > Name2.length()){
            return Name1.length() - Name2.length();
        }
        else{
            return 0;
        }
    }
}


