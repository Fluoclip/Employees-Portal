package com.example.employmanager.configuration.models;

import java.util.Objects;

public class JobSItes {
    private Integer Id;
    private String Name;
    private String Street;
    private String City;
    private String ContractBelongsTo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobSItes jobSItes = (JobSItes) o;
        return Objects.equals(Id, jobSItes.Id) && Objects.equals(Name, jobSItes.Name) && Objects.equals(Street, jobSItes.Street) && Objects.equals(City, jobSItes.City) && Objects.equals(ContractBelongsTo, jobSItes.ContractBelongsTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name, Street, City, ContractBelongsTo);
    }

    @Override
    public String toString() {
        return "JobSItes{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Street='" + Street + '\'' +
                ", City='" + City + '\'' +
                ", ContractBelongsTo='" + ContractBelongsTo + '\'' +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public String getContractBelongsTo() {
        return ContractBelongsTo;
    }

    public void setContractBelongsTo(String contractBelongsTo) {
        ContractBelongsTo = contractBelongsTo;
    }

    public JobSItes(Integer id, String name, String street, String city, String contractBelongsTo) {
        Id = id;
        Name = name;
        Street = street;
        City = city;
        ContractBelongsTo = contractBelongsTo;
    }
}
