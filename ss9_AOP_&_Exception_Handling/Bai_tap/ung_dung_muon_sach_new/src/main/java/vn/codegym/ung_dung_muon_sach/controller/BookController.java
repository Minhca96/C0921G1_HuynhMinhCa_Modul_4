package vn.codegym.ung_dung_muon_sach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.codegym.ung_dung_muon_sach.service.IBookService;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    private IBookService iBookService;
@GetMapping(" ")
    private String showAll(Model model, @PageableDefault Pageable pageable){
    model.addAttribute("bookList", iBookService.findAll(pageable));
    return "home";
}
@GetMapping("{id}/viewBook")
    private String viewBook(Model model, @PathVariable Long id){
    model.addAttribute("book",iBookService.getById(id));
    return "viewBook";
}
}
