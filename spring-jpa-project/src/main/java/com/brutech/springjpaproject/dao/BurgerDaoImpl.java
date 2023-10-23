package com.brutech.springjpaproject.dao;

import com.brutech.springjpaproject.entity.Burger;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
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
    @Transactional
    @Override
    public Burger save(Burger burger) {
        entityManager.persist(burger);
        return burger;
    }

    @Override
    public Burger findById(Long id) {
        return entityManager.find(Burger.class, id);
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
                .createQuery("SELECT b FROM Burger b WHERE price > :price ORDER BY b.price DESC", Burger.class);
        query.setParameter("price", price);
        return query.getResultList();
    }

    @Override
    public List<Burger> findByBreadType(String breadType) {
        TypedQuery<Burger> query = entityManager
                .createQuery("SELECT b FROM Burger b WHERE b.breadType = :breadType ORDER BY b.name", Burger.class);
        query.setParameter("breadType", breadType);
        return query.getResultList();
    }

    @Override
    public List<Burger> findByContent(String content) {
        TypedQuery<Burger> query = entityManager
                .createQuery("SELECT b FROM Burger b WHERE b.contents LIKE CONCAT('%' , :content , '%') ORDER BY b.name", Burger.class);
        query.setParameter("content", content);
        return query.getResultList();
    }
    @Transactional
    @Override
    public Burger update(Burger burger) {
        return entityManager.merge(burger);
    }
    @Transactional
    @Override
    public Burger delete(Long id) {
        Burger burger = findById(id);
        entityManager.remove(burger);
        return burger;
    }

    //TODO 1.19.00 video devam
}
