package com.engagepoint.university.inetStore.dto;

import com.engagepoint.university.inetStore.dto.base.BaseDTO;


public class CarDTO implements BaseDTO {

    private long id;
    private int year;
    private String color;
    private String manufacturer;
    private String model;

    public CarDTO(String model, int year, String manufacturer, String color){
        this.year = year;
        this.color = color;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
