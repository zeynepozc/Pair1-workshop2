package com.etiya.spring.repository;

import com.etiya.spring.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    Product getById(int id);
    Product add(Product product);
    void delete(int id);
    Product update(int id, Product product);
}
