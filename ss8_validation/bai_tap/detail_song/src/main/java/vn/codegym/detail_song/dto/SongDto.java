package vn.codegym.detail_song.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto {
    private Long id;
    @NotBlank
    @Size(min = 1, max = 800)
    @Pattern(message = "ten bai hat phai dung chuan tieng viet",regexp="^([A-Z][a-z]+)( [A-Z][a-z]*)*$")
    private String name;
    @NotBlank
    @Size(min = 1, max = 800)
    @Pattern(message = "ten rieng phai dung chuan tieng viet",regexp="^([A-Z][a-z]+)( [A-Z][a-z]*)*$")
    private String type;
    @NotBlank
    @Size(min = 1, max = 800)
    @Pattern(message = "ten ca sy phai dung chuan tieng viet",regexp="^([A-Z][a-z]+)( [A-Z][a-z]*)*$")
    private String single;

    public SongDto() {
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

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    @Override
    public String toString() {
        return "SongDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", single='" + single + '\'' +
                '}';
    }
}
