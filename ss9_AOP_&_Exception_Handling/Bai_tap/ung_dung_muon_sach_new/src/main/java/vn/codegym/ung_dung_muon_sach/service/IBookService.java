package vn.codegym.ung_dung_muon_sach.service;


import vn.codegym.ung_dung_muon_sach.model.Book;

public interface IBookService {
    Iterable<Book> findAll();

    Book findById(Long id);

    void save(Book book);
}
