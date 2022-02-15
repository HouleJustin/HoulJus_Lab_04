/*
 * Name: Justin Houle
 * Date: 2022/02/15
 * Description: the main class used to test the Age comparator and LexicographicComparator
 */
package Lab04A;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The main class used to test the Age comparator and LexicographicComparator.
 */
public class Main {
    /**
     * The method which the tests are implemented in.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Person p0 = new Person(7, "Emmanuelle");
        Person p1 = new Person(7, "Max");
        Person p2 = new Person(20, "BobTheBuilder");
        Person p3 = new Person(33, "Justin");
        Person p4 = new Person(21, "Jasmine");
        Person p5 = new Person(37, "Rene");
        Person p6 = new Person(75, "Max");
        Person p7 = new Person(96, "Paolo");
        Person p8 = new Person(74, "Sonia");
        Person p9 = new Person(33, "Andrew");

        List<Person> people = Arrays.asList(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
        System.out.println("UnSorted List: " + people.toString());

        Collections.sort(people, new AgeComparator());
        System.out.println("Sorted by age: " + people.toString());
        Collections.sort(people, new LexicographicComparator());
        System.out.println("Sorted by name: " + people.toString());


        for(int i = 0; i<100; i++){
            boolean number = (Math.random() < 0.2);
            System.out.println(number);
        }




    }


}
