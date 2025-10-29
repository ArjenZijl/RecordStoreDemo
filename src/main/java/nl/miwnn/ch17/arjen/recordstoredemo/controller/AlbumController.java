package nl.miwnn.ch17.arjen.recordstoredemo.controller;

import nl.miwnn.ch17.arjen.recordstoredemo.model.Album;
import nl.miwnn.ch17.arjen.recordstoredemo.repositories.AlbumRepository;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Arjen Zijlstra
 * Handle requests regarding albums
 */

@Controller
public class AlbumController {
    private final AlbumRepository albumRepository;

    public AlbumController(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @GetMapping({"/album/all","/"})
    private String ShowAlbumOverview(Model datamodel) {

        datamodel.addAttribute("albums", albumRepository.findAll());

        return "albumOverview";
    }

    @GetMapping("/album/add")
    public String showAlbumForm(Model datamodel) {
        datamodel.addAttribute("formAlbum", new Album());

        return "albumForm";
    }

    @PostMapping("/album/save")
    public String saveOrUpdateAlbum(@ModelAttribute("formAlbum") Album album, BindingResult result) {
        if (!result.hasErrors()) {
            albumRepository.save(album);
        }

        return "redirect:/album/all";
    }


}
