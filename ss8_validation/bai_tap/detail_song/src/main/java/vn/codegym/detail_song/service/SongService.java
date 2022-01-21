package vn.codegym.detail_song.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.detail_song.model.Song;
import vn.codegym.detail_song.repository.ISongRepository;

import java.util.Optional;

@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepository iSongRepository;

    @Override
    public Page<Song> findAll(Pageable pageable) {
        return iSongRepository.findAll(pageable);
    }



    @Override
    public void save(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public Page<Song> findByNameContaining(String s, Pageable p) {
        return iSongRepository.findByNameContaining(s,p);
    }

    @Override
    public Song getById(Long id) {
        return iSongRepository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        iSongRepository.deleteById(id);
    }





}
