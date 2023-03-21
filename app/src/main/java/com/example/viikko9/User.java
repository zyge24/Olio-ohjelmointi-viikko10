package com.example.viikko9;

public class User extends UserStorage {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;

    public User (String firstName, String lastName, String email, String degreeProgram){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

}
