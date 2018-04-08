package example.com.android_zad2_238292.model;

/**
 * Created by Rafał on 2018-03-16.
 */

public class Person {

    private String name;
    private String surname;
    private String birthDate;

    public Person(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
