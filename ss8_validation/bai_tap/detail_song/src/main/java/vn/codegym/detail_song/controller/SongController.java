package vn.codegym.detail_song.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import vn.codegym.detail_song.dto.SongDto;
import vn.codegym.detail_song.service.ISongService;

@Controller
public class SongController {
    @Autowired
    private ISongService iSongService;
    @GetMapping("listAll")
    private String listAll(Model model, @PageableDefault Pageable pageable){
        model.addAttribute("songList",iSongService.findAll(pageable));
        return "index";
    }

    @GetMapping("createShow")
    private String createShow(Model model){
        model.addAttribute("song",new SongDto());
        return "create";
    }

}
