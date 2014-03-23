package com.engagepoint.university.inetStore.util;


import com.engagepoint.university.inetStore.dto.MobileDTO;
import com.engagepoint.university.inetStore.dto.base.BaseDTO;
import com.engagepoint.university.inetStore.entity.Mobile;
import com.engagepoint.university.inetStore.entity.base.BaseEntity;

public final class Converter implements ToDTOConverter<BaseEntity, BaseDTO>, ToEntityConverter<BaseDTO, BaseEntity> {

    private Converter() {
    }

    public static MobileDTO convert(Mobile from){
        MobileDTO mobileDTO = new MobileDTO();
        mobileDTO.setId(from.getId());
        mobileDTO.setBrand(from.getBrand());
        mobileDTO.setModel(from.getModel());
        mobileDTO.setImage(from.getImage());
        mobileDTO.setOptions(from.getOptions());
        mobileDTO.setPrice(from.getPrice());
        mobileDTO.setNumber(from.getNumber());
        return mobileDTO;
    }
    public static Mobile convert(MobileDTO from){
        Mobile mobile = new Mobile();
        mobile.setId(from.getId());
        mobile.setBrand(from.getBrand());
        mobile.setModel(from.getModel());
        mobile.setImage(from.getImage());
        mobile.setOptions(from.getOptions());
        mobile.setPrice(from.getPrice());
        mobile.setNumber(from.getNumber());
        return mobile;
    }


    @Override
    public BaseDTO convert(BaseEntity from) {
        return null;
    }

    @Override
    public BaseEntity convert(BaseDTO from) {
        return null;
    }
}
