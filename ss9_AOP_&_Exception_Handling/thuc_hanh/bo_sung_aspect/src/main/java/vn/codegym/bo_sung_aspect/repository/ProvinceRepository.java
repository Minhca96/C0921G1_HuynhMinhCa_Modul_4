package vn.codegym.bo_sung_aspect.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.bo_sung_aspect.model.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {
}
