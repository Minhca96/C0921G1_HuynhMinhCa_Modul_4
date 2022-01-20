package vn.codegym.detail_song.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  private String name;
  private String type;
  private String single;

    public Song() {
    }

    public Song(Long id, String name, String type, String single) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.single = single;
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
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", single='" + single + '\'' +
                '}';
    }
}
