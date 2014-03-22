package com.engagepoint.university.inetStore.entity;


import java.io.Serializable;

public class Car implements Serializable {
    private int year;
    private String color;
    private String manufacturer;
    private String model;

    public Car(String model,int year,String color,String manufacturer){
        this.year = year;
        this.color = color;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
