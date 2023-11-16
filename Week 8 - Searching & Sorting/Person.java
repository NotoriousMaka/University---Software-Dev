/**
 * The Person class represents an individual with attributes such as height, age, and gender.
 * @author Alexe Tataru
 */
public class Person {
    int height = 0;
    int age = 0;
    Boolean gender;

    /**
     * Constructs a new Person with the specified height, age, and gender.
     *
     * @param height the height of the person
     * @param age    the age of the person
     * @param gender the gender of the person (true for male, false for female)
     */
    public Person(int height, int age, boolean gender) {
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    /**
     * Sets the age of the person.
     *
     * @param age the new age of the person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the gender of the person.
     *
     * @param gender the new gender of the person (true for male, false for female)
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * Sets the height of the person.
     *
     * @param height the new height of the person
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Retrieves the gender of the person.
     *
     * @return the gender of the person
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * Retrieves the age of the person.
     *
     * @return the age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * Retrieves the height of the person.
     *
     * @return the height of the person
     */
    public int getHeight() {
        return height;
    }

    /**
     * Returns a string representation of the person.
     *
     * @return a string representation of the person
     */
    @Override
    public String toString() {
        return "Person{" + "height = " + height + ", age = " + age + ", gender = " + gender + "}";
    }
}