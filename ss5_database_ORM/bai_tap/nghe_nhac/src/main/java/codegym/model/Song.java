package codegym.model;

import javax.persistence.*;

@Entity
@Table
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String single;
    private String listening;

    public Song() {
    }

    public Song(String name, String single, String listening) {
        this.name = name;
        this.single = single;
        this.listening = listening;
    }

    public Song(int id, String name, String single, String listening) {
        this.id = id;
        this.name = name;
        this.single = single;
        this.listening = listening;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getListening() {
        return listening;
    }

    public void setListening(String listening) {
        this.listening = listening;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", single='" + single + '\'' +
                ", listening='" + listening + '\'' +
                '}';
    }
}
