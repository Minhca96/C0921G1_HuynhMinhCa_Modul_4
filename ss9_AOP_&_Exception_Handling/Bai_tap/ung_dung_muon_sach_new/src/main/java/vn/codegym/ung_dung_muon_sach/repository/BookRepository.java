package vn.codegym.ung_dung_muon_sach.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.ung_dung_muon_sach.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
}