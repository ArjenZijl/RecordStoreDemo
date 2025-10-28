package nl.miwnn.ch17.arjen.recordstoredemo.controller;

import nl.miwnn.ch17.arjen.recordstoredemo.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author Arjen Zijlstra
 * Handle requests regarding albums
 */

@Controller
public class AlbumController {

    @GetMapping("/albums")
    private static String ShowAlbumOverview(Model datamodel) {
        ArrayList<Album> albums = new ArrayList<>();

        albums.add(new Album("Brothers in Arms"));
        albums.add(new Album("I Never Loved a Man the Way I Love You"));
        albums.add(new Album("Rumours"));


        datamodel.addAttribute("albums", albums);

        return "albumOverview";
    }

}
