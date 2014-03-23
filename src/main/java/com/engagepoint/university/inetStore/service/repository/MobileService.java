package com.engagepoint.university.inetStore.service.repository;


import com.engagepoint.university.inetStore.dto.MobileDTO;
import com.engagepoint.university.inetStore.entity.Mobile;
import com.engagepoint.university.inetStore.service.GenericService;

import java.util.List;

public interface MobileService extends GenericService<MobileDTO>{
    public List<MobileDTO> getMobilesByBrand(String brand);
    public List<MobileDTO> getMobilesByModel(String model);
}
