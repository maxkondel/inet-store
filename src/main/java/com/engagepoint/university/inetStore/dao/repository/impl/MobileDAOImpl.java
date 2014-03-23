package com.engagepoint.university.inetStore.dao.repository.impl;


import com.engagepoint.university.inetStore.dao.repository.MobileDAO;
import com.engagepoint.university.inetStore.dataSource.DataSource;
import com.engagepoint.university.inetStore.entity.Mobile;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class MobileDAOImpl implements MobileDAO {

    @Inject
    private DataSource dataSource;

    @Override
    public Mobile getById(int id) {
        List<Mobile> mobiles = dataSource.getMobiles();
        Mobile mobile = new Mobile();
        for (Mobile mobile1:mobiles){
            if (mobile1.getId() == id){
                mobile = mobile1;
                break;
            }
        }
        return mobile;
    }

    @Override
    public List<Mobile> getAll() {
        return dataSource.getMobiles();
    }

    @Override
    public void save(Mobile mobile) {
        List<Mobile> mobiles = dataSource.getMobiles();
        dataSource.setId();
        mobile.setId(dataSource.getId());
        mobiles.add(mobile);
        dataSource.setMobiles(mobiles);

    }

    @Override
    public void update(Mobile mobile) {

    }

    @Override
    public void delete(Long id) {
        List<Mobile> mobiles = dataSource.getMobiles();
        Mobile mobile = new Mobile();
        for (Mobile mobile1:mobiles){
            if (mobile1.getId() == id){
                mobile = mobile1;
                break;
            }
        }
        mobiles.remove(mobile);
        dataSource.setMobiles(mobiles);
    }

    @Override
    public void delete(Mobile mobile) {
        List<Mobile> mobiles = dataSource.getMobiles();
        mobiles.remove(mobile);
        dataSource.setMobiles(mobiles);
    }

    @Override
    public List<Mobile> getMobilesByBrand(String brand) {
        List<Mobile> mobiles = dataSource.getMobiles();
        List<Mobile> mobilesByBrand = new ArrayList<Mobile>();
        for (Mobile mobile:mobiles){
            if (mobile.getBrand().equals(brand)) mobilesByBrand.add(mobile);
        }
        return mobilesByBrand;
    }

    @Override
    public List<Mobile> getMobilesByModel(String model) {
        List<Mobile> mobiles = dataSource.getMobiles();
        List<Mobile> mobilesByModel = new ArrayList<Mobile>();
        for (Mobile mobile:mobiles){
            if (mobile.getModel().equals(model)) mobilesByModel.add(mobile);
        }
        return mobilesByModel;
    }
}
