package com.brutech.springjpaproject.dao;

import com.brutech.springjpaproject.entity.Burger;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BurgerDaoImpl implements BurgerDao {
    private EntityManager entityManager;
    @Autowired
    public BurgerDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Burger save(Burger burger) {
        return null;
    }

    @Override
    public Burger findById(Long id) {
        return null;
    }

    @Override
    public List<Burger> findAll() {
        return null;
    }

    @Override
    public List<Burger> findByPrice(Double price) {
        return null;
    }

    @Override
    public List<Burger> findByBreadType(String breadType) {
        return null;
    }

    @Override
    public List<Burger> findByContent(String content) {
        return null;
    }

    @Override
    public Burger update(Burger burger) {
        return null;
    }

    @Override
    public Burger delete(Long id) {
        return null;
    }
}
