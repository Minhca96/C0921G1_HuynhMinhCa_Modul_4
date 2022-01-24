package vn.codegym.ung_dung_muon_sach.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.ung_dung_muon_sach.model.Book;
@Repository
public interface IBookRepository extends JpaRepository<Book,Long> {

}
