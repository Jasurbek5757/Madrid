package kz.enu.Restvt.restexample.controller;

import kz.enu.Restvt.restexample.entities.Library;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {
    private final List<Library> libraries = new ArrayList<>();

    @GetMapping
    public List<Library> getLibraries() {
        return libraries;
    }

    @PostMapping
    public String addLibrary(@RequestBody Library library) {
        libraries.add(library);
        return "Library added: " + library.getName();
    }
}
