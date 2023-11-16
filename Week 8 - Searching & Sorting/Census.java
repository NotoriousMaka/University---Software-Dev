import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * The Census class represents a collection of people and provides methods for managing and analyzing the population.
 * @author Alexe Tataru
 */
public class Census {
    private final List<Person> people = new ArrayList<>();

    /**
     * Adds a person to the census.
     *
     * @param person the person to be added
     */
    void addPerson(Person person) {
        people.add(person);
    }

    /**
     * Returns true if a person was removed from the census.
     *
     * @param person the person to be removed
     */
    boolean removePerson(Person person) {
        return people.remove(person);
    }

    /**
     * Counts the total number of people in the census.
     *
     * @return the total number of people
     */
    int countPeople() {
        return people.size();
    }

    /**
     * Counts the number of males in the census.
     *
     * @return the number of males
     */
    int countMales() {
        int countMale = 0;
        for (Person person : people) {
            if (person.getGender()) {
                countMale++;
            }
        }
        return countMale;
    }

    /**
     * Counts the number of females in the census.
     *
     * @return the number of females
     */
    int countFemales() {
        int countFemale = 0;
        for (Person person : people) {
            if (!person.getGender()) {
                countFemale++;
            }
        }
        return countFemale;
    }

    /**
     * Sorts the people in the census based on their age.
     */
    void sortOnAge() {
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
    }

    /**
     * Sorts the people in the census based on their height.
     */
    void sortOnHeight() {
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(), o2.getHeight());
            }
        });
    }

    /**
     * Sorts the people in the census based on their gender.
     */
    void sortOnGender() {
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Boolean.compare(o1.getGender(), o2.getGender());
            }
        });
    }

    /**
     * Returns a string representation of the census, including details of all people.
     *
     * @return a string representation of the census
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\n");
        for (Person person : people) {
            result.append(person.toString()).append("\n");
        }
        return result.toString();
    }
}