package kz.enu.Restvt.restexample.controller;

import kz.enu.Restvt.restexample.entities.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final List<Book> books = new ArrayList<>();

    @GetMapping
    public List<Book> getBooks() {
        return books;
    }

    @PostMapping
    public String addBook(@RequestBody Book book) {
        books.add(book);
        return "Book added: " + book.getTitle();
    }
}
