package ru.vcu.cs.bookStore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vcu.cs.bookStore.dto.BookDto;
import ru.vcu.cs.bookStore.entity.Book;
import ru.vcu.cs.bookStore.service.BookService;

import java.util.List;

@RestController
public class BookController {
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/book")
    public List<Book> getAllBook() {
        return service.getAll();
    }

    @GetMapping("/book/{id}")
    public BookDto getBookById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @DeleteMapping("/book/delete/{id}")
    public void deleteBook(@PathVariable Integer id) {
        service.deleteBook(id);
    }

    @PostMapping("/book/new")
    public ResponseEntity<Book> addBook(@RequestBody BookDto dto) {
        return new ResponseEntity<>(service.addNewBook(dto), HttpStatus.OK);
    }

    @PutMapping("/book/edit")
    public void editBook(@RequestBody BookDto dto) {
        service.editBook(dto);
    }
}
