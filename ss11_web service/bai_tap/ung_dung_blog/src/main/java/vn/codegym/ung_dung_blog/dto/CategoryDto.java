package vn.codegym.ung_dung_blog.dto;

import vn.codegym.ung_dung_blog.model.Blog;

import java.util.List;

public class CategoryDto {
   private Long id;
   private String name;
   private List<Blog> blog;

    public CategoryDto() {
    }

    public CategoryDto(Long id, String name, List<Blog> blog) {
        this.id = id;
        this.name = name;
        this.blog = blog;
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

    public List<Blog> getBlog() {
        return blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "CategoryDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", blog=" + blog +
                '}';
    }
}
