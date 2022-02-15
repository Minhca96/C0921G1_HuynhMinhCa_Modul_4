package vn.codegym.ung_dung_blog_mo_rong_ajax.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @JsonBackReference
    @ManyToOne(targetEntity = Category.class)
    private Category category;

    public Blog() {
    }

    public Blog(Long id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}
