package vn.codegym.repository;

import vn.codegym.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    Product getById(int id);

    void update(Product product);

    void delete(int id);

    List<Product> search(String keyword);



}
