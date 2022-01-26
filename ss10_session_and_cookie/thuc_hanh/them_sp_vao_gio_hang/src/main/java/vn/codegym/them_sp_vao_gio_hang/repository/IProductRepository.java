package vn.codegym.them_sp_vao_gio_hang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.them_sp_vao_gio_hang.model.Product;
@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
}
