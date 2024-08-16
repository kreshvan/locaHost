package me.Dmitriev.DZ.SPRING;


import java.util.Objects;

public class Employee {
    String firstName;
    String lastName;
    String passport;

    public Employee(String firstName, String lastName, String passport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }
    public String getPassport(){
        return passport;
    }

    public void setFirstName() {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
    public void setPassport() {

        this.passport = passport;
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    @Override
    public String toString() {

        return super.toString();
    }

}










