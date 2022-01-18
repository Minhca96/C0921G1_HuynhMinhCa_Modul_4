package vn.codegym.repository;

import vn.codegym.model.Song;

import java.util.List;

public interface ISongRepository {
//    Tạo một bài hát mới (file nhạc được upload kèm theo)
//
//    Hiển thị danh sách những bài hát đã tạo
//
//    Cập nhật thông tin một bài hát
//
//    Nghe một bài hát trong danh sách
//
//    Xoá một bài hát khỏi danh sách
    List<Song> findAll();

    void save(Song song);

    Song getById(int id);

    void update(Song song);

    void delete(int id);

}
