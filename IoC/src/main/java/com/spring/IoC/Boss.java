package com.spring.IoC;

import java.util.List;

public class Boss {
    private String name;
    private String Company;
    private Car car;
    private List<String> hobby;

    public Boss() {
    }

    public Boss(String name, String company, Car car, List<String> hobby) {
        this.name = name;
        Company = company;
        this.car = car;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", Company='" + Company + '\'' +
                ", car=" + car +
                ", hobby=" + hobby +
                '}';
    }
}
