package com.engagepoint.university.inetStore.entity;


import com.engagepoint.university.inetStore.entity.base.BaseEntity;

import java.io.Serializable;

public class CarEntity implements Serializable,BaseEntity {
    private long id;
    private int year;
    private String color;
    private String manufacturer;
    private String model;

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
