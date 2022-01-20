package vn.codegym.detail_song.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.detail_song.model.Song;
import vn.codegym.detail_song.repository.ISongRepository;

@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepository iSongRepository;

    @Override
    public Page<Song> findAll(Pageable pageable) {
        return iSongRepository.findAll(pageable);
    }
}
