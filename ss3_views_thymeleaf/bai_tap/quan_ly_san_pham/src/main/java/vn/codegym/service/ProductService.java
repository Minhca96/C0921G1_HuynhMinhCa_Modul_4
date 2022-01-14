package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Product;
import vn.codegym.repository.IProductRepository;

import java.util.List;
@Service
public class ProductService implements IProductService{
    @Autowired
    IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void add(Product product) {

    }

    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public void edit(int id) {

    }

    @Override
    public void remote(int id) {

    }

    @Override
    public List<Product> search(String name) {
        return null;
    }
}
