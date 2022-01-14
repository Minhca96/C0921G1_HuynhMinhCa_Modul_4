package vn.codegym.service;

import vn.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product product);

    Product getById(int id);

    void edit(int id);

    void remote(int id);

    List<Product> search(String name);
}
