package com.brutech.springjpaproject.dao;

import com.brutech.springjpaproject.entity.Burger;

import java.util.List;

public interface BurgerDao {
    Burger save(Burger burger);
    Burger findById(Long id);
    List<Burger> findAll();
    List<Burger> findByPrice(Double price);
    List<Burger> findByBreadType(String breadType);
    List<Burger> findByContent(String content);
    Burger update(Burger burger);
    Burger delete(Long id);



}
