package com.example.interfaceprograms;

public class Country {
    private double area;
    private String Country;

    public Country(String country, double area) {
        this.Country = country;
        this.area = area;
    }

    public Country() {

    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCountry(String country) {
        this.Country = country;
    }
}
