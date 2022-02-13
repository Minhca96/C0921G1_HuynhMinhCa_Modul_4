package vn.codegym.ung_dung_blog.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import vn.codegym.ung_dung_blog.model.Category;

import javax.persistence.OneToMany;
import java.util.List;

public class BlogDto {
    private Long id;
    private String name;
    private String type;
    private List<Category> category;

    public BlogDto() {
    }

    public BlogDto(Long id, String name, String type, List<Category> category) {
        this.id = id;
        this.name = name;
        this.type = type;
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
