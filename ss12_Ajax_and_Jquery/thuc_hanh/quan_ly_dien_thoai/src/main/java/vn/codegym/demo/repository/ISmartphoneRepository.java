package vn.codegym.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.demo.model.Smartphone;

public interface ISmartphoneRepository extends JpaRepository<Smartphone,Long> {
}
