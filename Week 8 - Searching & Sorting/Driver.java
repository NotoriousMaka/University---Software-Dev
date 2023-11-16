/**
 * The Driver class serves as the entry point for the program and demonstrates the usage of the Census class.
 * @author Alexe Tataru
 */
public class Driver {
    /**
     * The main method creates an instance of the Census class, adds people, performs operations, and displays results.
     *
     * @param args the command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Census cen = new Census();

        Person person1 = new Person(175, 19, true);
        Person person2 = new Person(182, 20, true);
        Person person3 = new Person(154, 23, false);
        Person person4 = new Person(190, 19, true);
        Person person5 = new Person(187, 40, false);

        cen.addPerson(person1);
        cen.addPerson(person2);
        cen.addPerson(person3);
        cen.addPerson(person4);
        cen.addPerson(person5);

        System.out.println("People in census: ");
        System.out.println(cen.toString());

        cen.removePerson(person3);
        System.out.println("People after removing person3: ");
        System.out.println(cen.toString());

        System.out.println("Total people in the census: " + cen.countPeople());
        System.out.println("Number of males: " + cen.countMales());
        System.out.println("Number of females: " + cen.countFemales());

        System.out.println("People in the census (unsorted):");
        System.out.println(cen.toString());

        cen.sortOnAge();
        System.out.println("People in the census (sorted by age):");
        System.out.println(cen.toString());

        cen.sortOnHeight();
        System.out.println("People in the census (sorted by height):");
        System.out.println(cen.toString());

        cen.sortOnGender();
        System.out.println("People in the census (sorted by gender):");
        System.out.println(cen.toString());
    }
}