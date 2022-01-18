package codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import codegym.model.Song;
import codegym.service.ISongservice;

import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    ISongservice iSongservice;

   @GetMapping("")
    private String getHome(Model model){
       List<Song> songList = iSongservice.findAll();
       model.addAttribute("songList",songList);
       return "index";
   }

}
