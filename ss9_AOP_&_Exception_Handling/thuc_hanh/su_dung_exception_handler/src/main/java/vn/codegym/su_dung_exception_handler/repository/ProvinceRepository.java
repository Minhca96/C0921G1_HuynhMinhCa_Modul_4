package vn.codegym.su_dung_exception_handler.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.su_dung_exception_handler.model.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {
}
