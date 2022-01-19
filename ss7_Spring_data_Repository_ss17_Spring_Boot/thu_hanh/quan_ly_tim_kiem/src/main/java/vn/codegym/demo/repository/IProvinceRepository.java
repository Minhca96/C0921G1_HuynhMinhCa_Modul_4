package vn.codegym.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.codegym.demo.model.Province;

public interface IProvinceRepository extends JpaRepository<Province,Long> {
    void remove(Long id);
}
