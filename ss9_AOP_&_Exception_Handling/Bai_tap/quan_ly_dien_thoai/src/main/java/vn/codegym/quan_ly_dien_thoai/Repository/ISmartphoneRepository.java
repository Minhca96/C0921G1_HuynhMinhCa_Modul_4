package vn.codegym.quan_ly_dien_thoai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.quan_ly_dien_thoai.model.Smartphone;
@Repository
public interface ISmartphoneRepository extends JpaRepository<Smartphone, Long> {
}
