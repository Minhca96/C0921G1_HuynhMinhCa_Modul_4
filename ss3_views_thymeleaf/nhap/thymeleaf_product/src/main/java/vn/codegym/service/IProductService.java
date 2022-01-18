package vn.codegym.service;

import vn.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product getById(int id);

    void update(Product product);

    void delete(int id);

    List<Product> search(String keyword);
}
