package vn.codegym.detail_song.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.detail_song.dto.SongDto;
import vn.codegym.detail_song.model.Song;
import vn.codegym.detail_song.service.ISongService;

import java.util.Optional;

@Controller
public class SongController {
    @Autowired
    private ISongService iSongService;
    @GetMapping("listAll")
    private String listAll(Model model, @PageableDefault(value = 3) Pageable pageable, Optional<String> key_search){
        if (!key_search.isPresent() || key_search.equals("")){
            model.addAttribute("songList",iSongService.findAll(pageable));
        }else{
            model.addAttribute("songList",iSongService.findByNameContaining(key_search.get(),pageable));
        }

        return "index";
    }

    @GetMapping("createShow")
    private String createShow(Model model){
        model.addAttribute("songDto",new SongDto());
        return "create";
    }

    @PostMapping("create")
    private String create( @ModelAttribute @Validated SongDto songDto,
                          BindingResult bindingResult,
                          RedirectAttributes redirectAttributes){
        if(bindingResult.hasFieldErrors()){
            return "create";
        }else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto,song);
            iSongService.save(song);
            redirectAttributes.addFlashAttribute("message","Add new Song success");
            return "redirect:/listAll";
        }

    }
    @GetMapping("{id}/editShow")
    private String editShow(Model model, @PathVariable Long id,@ModelAttribute SongDto songDto){
        model.addAttribute("songDto",iSongService.getById(id));
        return "edit";
    }
    @PostMapping("edit")
    private String edit( @ModelAttribute @Validated SongDto songDto,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes){
        if(bindingResult.hasFieldErrors()){
            return "edit";
        }else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto,song);
            iSongService.save(song);
            redirectAttributes.addFlashAttribute("message","Add new Song success");
            return "redirect:/listAll";
        }

    }

}
