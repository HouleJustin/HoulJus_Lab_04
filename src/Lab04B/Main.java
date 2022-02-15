/*
 * Name: Justin Houle
 * Date: 2022/02/15
 * Description: The main tests for the classes "instructor", "Grad", "Lecturer" and "Faculty"
 */
package Lab04B;

/**
 * The main class used to test the classes "instructor", "Grad", "Lecturer" and "Faculty"
 */
public class Main {
    /**
     * Tests
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Grad Jim = new Grad(20, 0);
        Lecturer Micheal = new Lecturer(35, 0);
        Faculty Dwight = new Faculty(50, 0);


        Instructor[] school = {Jim, Micheal, Dwight};


        for (int days = 0; days < 10; days++) {
            int mail = ((days * 10) + 50);
            System.out.println("Day: " + days);
            for (int i = 0; i < school.length; i++) {
                school[i].getMail(mail);

             }


        }
    }
}
