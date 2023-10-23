package com.brutech.springjpaproject.dao;

import com.brutech.springjpaproject.entity.Burger;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
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
        TypedQuery<Burger> query = entityManager
                .createQuery("SELECT b FROM Burger b", Burger.class);
        return query.getResultList();
    }

    @Override
    public List<Burger> findByPrice(Double price) {
        TypedQuery<Burger> query = entityManager
                .createQuery("SELECT b FROM Burger b WHERE b.price = :price", Burger.class);
        return query.getResultList();
    }

    @Override
    public List<Burger> findByBreadType(String breadType) {
        TypedQuery<Burger> query = entityManager
                .createQuery("SELECT b FROM Burger b WHERE b.breadType = :breadType", Burger.class);
        return query.getResultList();
    }

    @Override
    public List<Burger> findByContent(String content) {
        TypedQuery<Burger> query = entityManager
                .createQuery("SELECT b FROM Burger b WHERE b.contents = :content", Burger.class);
        return query.getResultList();
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
