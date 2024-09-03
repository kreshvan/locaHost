package me.Dmitriev.DZ.SPRING;


import java.util.Objects;

public class Employee {
    String firstName;
    String lastName;
    String passport;
    int salary;
    int department;



    public Employee(String firstName, String lastName, String passport,int salary,int department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
        this.salary = salary;
        this.department = department;
    }

public String getFullName(){
        return firstName+lastName+passport;
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
    public int getSalary(){
        return salary;
    }

    public int getDepartment() {
        return department;
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
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










