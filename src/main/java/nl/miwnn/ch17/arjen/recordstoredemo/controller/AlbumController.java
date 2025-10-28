package nl.miwnn.ch17.arjen.recordstoredemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.time.LocalDateTime;

/**
 * @author Arjen Zijlstra
 * Handle requests regarding albums
 */

@Controller
public class AlbumController {

    @GetMapping("/albums")
    private String ShowAlbumOverview(Model datamodel) {
        datamodel.addAttribute("request-time", LocalDateTime.now());

        return "albumOverview";
    }

}
