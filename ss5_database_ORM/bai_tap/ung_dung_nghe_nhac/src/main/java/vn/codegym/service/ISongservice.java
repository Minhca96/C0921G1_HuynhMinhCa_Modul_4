package vn.codegym.service;

import vn.codegym.model.Song;

import java.util.List;

public interface ISongservice {
    List<Song> findAll();

    void save(Song song);

    Song getById(int id);

    void update(Song song);

    void delete(int id);

}
