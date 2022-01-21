package vn.codegym.detail_song.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.detail_song.model.Song;

import java.util.List;

public interface ISongService {
   Page<Song> findAll(Pageable pageable);


   void save(Song song);
   Page<Song> findByNameContaining(String s,Pageable p);

   Song getById(Long id);
}
