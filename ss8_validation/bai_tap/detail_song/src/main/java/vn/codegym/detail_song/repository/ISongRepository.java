package vn.codegym.detail_song.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.detail_song.model.Song;
@Repository
public interface ISongRepository extends JpaRepository<Song,Long> {
Page<Song> findByNameContaining(String s,Pageable p);
void deleteById(Long id);
}
