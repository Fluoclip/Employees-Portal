package com.example.employmanager.configuration.models;

import java.util.Objects;

public class Employee {

    private Integer ID;
    private String firstName;
    private String lastName;
    private String Street;
    private String City;
    private Integer telefonNum;
    private Integer bewacherId;
    private String lvlOfEducation;

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Street='" + Street + '\'' +
                ", City='" + City + '\'' +
                ", telefonNum=" + telefonNum +
                ", bewacherId=" + bewacherId +
                ", lvlOfEducation='" + lvlOfEducation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(ID, employee.ID) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(Street, employee.Street) && Objects.equals(City, employee.City) && Objects.equals(telefonNum, employee.telefonNum) && Objects.equals(bewacherId, employee.bewacherId) && Objects.equals(lvlOfEducation, employee.lvlOfEducation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, firstName, lastName, Street, City, telefonNum, bewacherId, lvlOfEducation);
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Integer getTelefonNum() {
        return telefonNum;
    }

    public void setTelefonNum(Integer telefonNum) {
        this.telefonNum = telefonNum;
    }

    public Integer getBewacherId() {
        return bewacherId;
    }

    public void setBewacherId(Integer bewacherId) {
        this.bewacherId = bewacherId;
    }

    public String getLvlOfEducation() {
        return lvlOfEducation;
    }

    public void setLvlOfEducation(String lvlOfEducation) {
        this.lvlOfEducation = lvlOfEducation;
    }

    public Employee(Integer ID, String firstName, String lastName, String street, String city, Integer telefonNum, Integer bewacherId, String lvlOfEducation) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        Street = street;
        City = city;
        this.telefonNum = telefonNum;
        this.bewacherId = bewacherId;
        this.lvlOfEducation = lvlOfEducation;
    }
}
