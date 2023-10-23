package com.brutech.springjpaproject.controller;

import com.brutech.springjpaproject.dao.BurgerDao;
import com.brutech.springjpaproject.entity.BreadType;
import com.brutech.springjpaproject.entity.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/burger")
public class BurgerController {

    private BurgerDao burgerDao;

    @Autowired
    public BurgerController(BurgerDao burgerDao) {
        this.burgerDao = burgerDao;
    }

    @PostMapping("/")
    public Burger save(@RequestBody Burger burger) {
        return burgerDao.save(burger);
    }

    @GetMapping("/")
    public List<Burger> findAll() {
        return burgerDao.findAll();
    }

    @GetMapping("/{id}")
    public Burger findById(@PathVariable Long id) {
        return burgerDao.findById(id);
    }

    @PutMapping("/")
    public Burger update(@RequestBody Burger burger) {
        return burgerDao.update(burger);
    }

    @DeleteMapping("/{id}")
    public Burger delete(@PathVariable Long id) {
        return burgerDao.delete(id);
    }

    @GetMapping("/price/{price}")
    public List<Burger> findByPrice(@PathVariable Double price) {
        return burgerDao.findByPrice(price);
    }

    @GetMapping("/breadType/{breadType}")
    public List<Burger> findByBreadType(@PathVariable String breadType) {
        BreadType breadEnum = BreadType.valueOf(breadType);
        return burgerDao.findByBreadType(String.valueOf(breadEnum));
    }

    @GetMapping("/breadType/{content}")
    public List<Burger> findByContent(@PathVariable String content) {
        return burgerDao.findByContent(content);
    }

}
