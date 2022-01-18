package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Song;
import vn.codegym.repository.ISongRepository;

import java.util.List;
@Service
public class SongService implements ISongservice{
    @Autowired
    ISongRepository iSongRepository;
    @Override
    public List<Song> findAll() {
        return iSongRepository.findAll();
    }

    @Override
    public void save(Song song) {

    }

    @Override
    public Song getById(int id) {
        return null;
    }

    @Override
    public void update(Song song) {

    }

    @Override
    public void delete(int id) {

    }
}
