package com.engagepoint.university.inetStore.util;


import com.engagepoint.university.inetStore.dto.base.BaseDTO;
import com.engagepoint.university.inetStore.entity.base.BaseEntity;

public interface ToEntityConverter<T extends BaseDTO, E extends BaseEntity> {
    public E convert(T from);
}
