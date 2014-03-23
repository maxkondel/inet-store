package com.engagepoint.university.inetStore.service.repository.impl;


import com.engagepoint.university.inetStore.dao.repository.MobileDAO;
import com.engagepoint.university.inetStore.dto.MobileDTO;
import com.engagepoint.university.inetStore.entity.Mobile;
import com.engagepoint.university.inetStore.service.repository.MobileService;
import com.engagepoint.university.inetStore.util.Converter;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class MobileServiceImpl implements MobileService {

    @Inject
    MobileDAO mobileDAO;

    @Override
    public MobileDTO getById(int id) {
        Mobile mobile = mobileDAO.getById(id);
        return Converter.convert(mobile);
    }

    @Override
    public List<MobileDTO> getAll() {
        List<Mobile> mobiles = mobileDAO.getAll();
        List<MobileDTO> mobileDTOs = new ArrayList<>();
        for (Mobile mobile:mobiles){
            mobileDTOs.add(Converter.convert(mobile));
        }
        return mobileDTOs;
    }

    @Override
    public void save(MobileDTO mobileDTO) {
    mobileDAO.save(Converter.convert(mobileDTO));
    }

    @Override
    public void update(MobileDTO mobileDTO) {

    }

    @Override
    public void delete(Long id) {
    mobileDAO.delete(id);
    }

    @Override
    public void delete(MobileDTO mobileDTO) {
    mobileDAO.delete(Converter.convert(mobileDTO));
    }

    @Override
    public List<MobileDTO> getMobilesByBrand(String brand) {
        List<Mobile> mobiles = mobileDAO.getMobilesByBrand(brand);
        List<MobileDTO> mobileDTOs = new ArrayList<>();
        for (Mobile mobile:mobiles){
            mobileDTOs.add(Converter.convert(mobile));
        }
        return mobileDTOs;
    }

    @Override
    public List<MobileDTO> getMobilesByModel(String model) {
        List<Mobile> mobiles = mobileDAO.getMobilesByModel(model);
        List<MobileDTO> mobileDTOs = new ArrayList<>();
        for (Mobile mobile:mobiles){
            mobileDTOs.add(Converter.convert(mobile));
        }
        return mobileDTOs;
    }
}
