package codegym.repository;

import codegym.model.Song;

import java.util.List;

public interface ISongRepository {

    List<Song> findAll();

    void save(Song song);

    Song getById(int id);

    void update(Song song);

    void delete(int id);

}
