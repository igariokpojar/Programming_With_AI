package day_01;

/**
 * A class representing a person with a name, age, and gender.
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    /**
     * Constructs a new person with the given name, age, and gender.
     *
     * @param name The name of the person.
     * @param age The age of the person. It must be a non-negative integer and not exceed 150.
     * @param gender The gender of the person.
     * @throws IllegalArgumentException if the age is not within the valid range.
     */
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name The new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age The new age of the person. It must be a non-negative integer and not exceed 150.
     * @throws IllegalArgumentException if the age is not within the valid range.
     */
    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 0 and 150.");
        }
    }

    /**
     * Gets the gender of the person.
     *
     * @return The gender of the person.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the person.
     *
     * @param gender The new gender of the person.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Returns a string representation of the person.
     *
     * @return A string representation of the person in the format "Person{name='name', age=age, gender='gender'}"
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';

    }
}
  
// Create a class named Person with private fields name, age, and gender.
// encapsulate the fields using appropriate getter and setter methods.
// create a constructor that takes name, age, and gender as parameters and initializes the fields.
// create toString method
