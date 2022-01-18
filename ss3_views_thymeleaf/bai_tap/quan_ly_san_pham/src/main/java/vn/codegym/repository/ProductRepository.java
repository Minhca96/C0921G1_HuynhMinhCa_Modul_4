package vn.codegym.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository{

    private static final Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1,"Xiaomi Mi 10","13000000","Snapdragon 865","Xiaomi"));
        productMap.put(2, new Product(2,"Iphone 12","20000000","Bionic 14","Apple"));
        productMap.put(3, new Product(3,"Galaxy s20 ultra","15000000","Snapdragon 865","Samsung"));
        productMap.put(4, new Product(4,"Xiaomi Mi 12","18000000","Snapdragon 865","Xiaomi"));
        productMap.put(5, new Product(5,"Iphone 12 pro max","33000000","Bionic 14","Apple"));
        productMap.put(6, new Product(6,"Realme 8 pro","9000000","Snapdragon 730","Realme"));
        productMap.put(7, new Product(7,"Oppo find x3","16000000","Snapdragon 865","Oppo"));
        productMap.put(8, new Product(8,"One Plus 9","13000000","Snapdragon 870","One+"));
        productMap.put(9, new Product(9,"Xiaomi Mi 11","13000000","Snapdragon 888","Xiaomi"));

    }



    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void add(Product product) {
        productMap.put(product.getId(),product);

    }

    @Override
    public Product getById(int id) {
        return productMap.get(id);
    }

    @Override
    public void edit(int id,Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remote(int id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> list = new ArrayList<>();
        for (Product p: productMap.values()) {
            if(p.getName().toLowerCase().contains(name.toLowerCase())){
                list.add(p);
            }
        }
        return list;
    }




}
