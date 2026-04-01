package model;

import java.time.LocalDate;

public class Person {

    private String passportNumber;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person(String passportNumber, String firstName, String lastName, LocalDate dateOfBirth) {
        this.passportNumber = passportNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
