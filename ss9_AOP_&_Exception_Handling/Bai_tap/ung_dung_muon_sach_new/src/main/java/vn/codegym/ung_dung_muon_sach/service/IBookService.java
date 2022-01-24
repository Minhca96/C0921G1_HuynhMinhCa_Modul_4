package vn.codegym.ung_dung_muon_sach.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.ung_dung_muon_sach.model.Book;

public interface IBookService {
 Page<Book> findAll(Pageable pageable);

 Book getById(Long id);
}
