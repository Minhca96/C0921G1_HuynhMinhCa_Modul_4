package vn.codegym.demo.service;

import vn.codegym.demo.model.Province;

import java.util.Optional;

public interface IProvinceService {
    Iterable<Province> findAll();

    void save(Province province);

    Optional<Province> findById(Long id);

    void remove(Long id);
}
