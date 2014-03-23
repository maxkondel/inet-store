package com.engagepoint.university.inetStore.dao;


import com.engagepoint.university.inetStore.entity.base.BaseEntity;

import java.util.List;

public interface GenericDAO<T extends BaseEntity> {
    public T getById(int id);
    public List<T> getAll();
    public void save(T t);
    public void update(T t);
    public void delete(Long id);
    public void delete(T t);
}
