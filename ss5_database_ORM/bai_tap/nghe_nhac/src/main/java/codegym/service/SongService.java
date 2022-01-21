package codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import codegym.model.Song;
import codegym.repository.ISongRepository;

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
        iSongRepository.save(song);
    }

    @Override
    public Song getById(int id) {
        return iSongRepository.getById(id);
    }

    @Override
    public void update(Song song) {
        iSongRepository.update(song);
    }

    @Override
    public void delete(int id) {
        iSongRepository.delete(id);
    }
}
