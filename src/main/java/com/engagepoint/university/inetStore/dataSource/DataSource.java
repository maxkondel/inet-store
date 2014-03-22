package com.engagepoint.university.inetStore.dataSource;

import com.engagepoint.university.inetStore.entity.CarEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class DataSource implements Serializable {

    private List<CarEntity> cars= new ArrayList<>();

    public List<CarEntity> getCars() {
        return cars;
    }

    public void setCars(List<CarEntity> cars) {
        this.cars = cars;
    }
}
