package vn.codegym.ung_dung_muon_sach.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.ung_dung_muon_sach.model.Book;
import vn.codegym.ung_dung_muon_sach.repository.IBookRepository;

@Service
public class BookService implements IBookService{
    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return iBookRepository.findAll(pageable);
    }

    @Override
    public Book getById(Long id) {
        return iBookRepository.getById(id);
    }
}
