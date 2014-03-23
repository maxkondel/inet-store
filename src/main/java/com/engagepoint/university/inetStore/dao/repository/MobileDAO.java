package com.engagepoint.university.inetStore.dao.repository;

import com.engagepoint.university.inetStore.dao.GenericDAO;
import com.engagepoint.university.inetStore.entity.Mobile;

import java.util.List;

public interface MobileDAO extends GenericDAO<Mobile> {
    public List<Mobile> getMobilesByBrand(String brand);
    public List<Mobile> getMobilesByModel(String model);
}
