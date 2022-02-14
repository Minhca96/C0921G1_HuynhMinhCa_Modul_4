package vn.codegym.ung_dung_blog.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import vn.codegym.ung_dung_blog.model.Category;

import javax.persistence.OneToMany;
import java.util.List;

public class BlogDto {
    private Long id;
    private String name;
    private String type;
    private Category category;

    public BlogDto() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "BlogDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", category=" + category +
                '}';
    }
}
