package com.engagepoint.university.inetStore.util;


import com.engagepoint.university.inetStore.dto.base.BaseDTO;
import com.engagepoint.university.inetStore.entity.base.BaseEntity;

public interface ToDTOConverter<E extends BaseEntity, T extends BaseDTO> {
    public T convert(E from);
}
