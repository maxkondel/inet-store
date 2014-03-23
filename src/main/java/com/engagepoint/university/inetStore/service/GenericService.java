package com.engagepoint.university.inetStore.service;


import com.engagepoint.university.inetStore.dto.base.BaseDTO;

import java.util.List;

public interface GenericService<T extends BaseDTO> {
    public T getById(int id);
    public List<T> getAll();
    public void save(T t);
    public void update(T t);
    public void delete(Long id);
    public void delete(T t);
}
