package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository{
    private static final Map<Integer,Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"Xiaomi 12 pro","Snapdragon 8Gen 1","Xiaomi"));
        productMap.put(2,new Product(2,"Iphone 13 pro","Apple Bionic 14","Apple"));
        productMap.put(3,new Product(3,"One+ 10 pro","Snapdragon 888","One+"));
        productMap.put(4,new Product(4,"Huawei Mate 40 pro","Kirin 9000","Huawei"));
    }



    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product getById(int id) {

        return productMap.get(id);
    }

    @Override
    public void update(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> search(String keyword) {
        List<Product> list = new ArrayList<>();
        for (Product p: productMap.values()) {
            if(p.getName().toLowerCase().contains(keyword.toLowerCase())){
                list.add(p);
            }

        }
        return list;
    }
}
