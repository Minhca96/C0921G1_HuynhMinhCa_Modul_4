package codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import codegym.model.Song;
import codegym.service.ISongservice;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
   @GetMapping("{id}/delete")
    private String delete(@PathVariable int id, RedirectAttributes redirectAttributes){
       iSongservice.delete(id);
       redirectAttributes.addFlashAttribute("message","xoa thanh cong");
       return "redirect:/song";
   }
   @GetMapping("createShow")
    private String createShow(Model model){
       model.addAttribute("song",new Song());
       return "create";
   }
   @PostMapping("create")
    private String create(@ModelAttribute Song song, RedirectAttributes redirectAttributes){
       iSongservice.save(song);
       redirectAttributes.addFlashAttribute("message","them moi thanh cong");
       return "redirect:/song";
   }

   @GetMapping("{id}/editShow")
    private String createShow(@PathVariable int id, Model model){
       model.addAttribute("song",iSongservice.getById(id));
       return "edit";
   }
   @PostMapping("edit")
    private String edit(@ModelAttribute Song song, RedirectAttributes redirectAttributes){
       iSongservice.update(song);
       redirectAttributes.addFlashAttribute("message","them moi thanh cong");
       return "redirect:/song";
   }


}
