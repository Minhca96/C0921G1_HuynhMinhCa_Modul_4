package vn.codegym.ung_dung_muon_sach.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String idCard;
    private int toTal;
    private String name;
    private String author;
    private String detail;

    public Book() {
    }

    public Book(Long id, String idCard, int toTal, String name, String author, String detail) {
        this.id = id;
        this.idCard = idCard;
        this.toTal = toTal;
        this.name = name;
        this.author = author;
        this.detail = detail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getToTal() {
        return toTal;
    }

    public void setToTal(int toTal) {
        this.toTal = toTal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", idCard='" + idCard + '\'' +
                ", toTal=" + toTal +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
