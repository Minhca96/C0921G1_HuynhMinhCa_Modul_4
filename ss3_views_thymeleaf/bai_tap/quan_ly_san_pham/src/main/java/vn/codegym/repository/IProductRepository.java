package vn.codegym.repository;

import vn.codegym.model.Product;

import java.util.List;

public interface IProductRepository {
//    Hiển thị danh sách sản phẩm
//    Tạo sản phẩm mới
//    Cập nhật thông tin sản phẩm
//    Xoá một sản phẩm
//    Xem chi tiết một sản phẩm
//    Tìm kiếm sản phẩm theo tên
    List<Product> findAll();

    void add(Product product);

    Product getById(int id);

    void edit(int id);

    void remote(int id);

    List<Product> search(String name);





}
