package vn.codegym.gio_hang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.gio_hang.model.Product;
import vn.codegym.gio_hang.repository.IProductRepository;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Iterable<Product> getAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> getById(Long id) {
        return iProductRepository.findById(id);
    }
}
