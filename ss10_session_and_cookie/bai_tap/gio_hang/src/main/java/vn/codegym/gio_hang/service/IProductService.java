package vn.codegym.gio_hang.service;

import vn.codegym.gio_hang.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> getAll();

    Optional<Product> getById(Long id);
}
