package ru.vcu.cs.bookStore.service;

import org.springframework.stereotype.Service;
import ru.vcu.cs.bookStore.dto.BookDto;
import ru.vcu.cs.bookStore.entity.Book;
import ru.vcu.cs.bookStore.mapper.BookMapper;
import ru.vcu.cs.bookStore.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repository;
    private final BookMapper mapper;

    public BookService(BookRepository repository, BookMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    private Book findById(Integer id) {
        return repository.findAll().stream().filter(com -> com.getBook_id().equals(id)).toList().get(0);
    }

    public void deleteBook(Integer id) {
        repository.delete(findById(id));
    }

    public Book addNewBook(BookDto dto) {
        return repository.save(mapper.toEntity(dto));
    }

    public List<Book> getAll() {
        return repository.findAll();
    }

    public BookDto getById(Integer id) {
        return mapper.toDto(findById(id));
    }

    public void editBook(BookDto dto) {
        Book book = new Book();
        book.setBook_id(dto.getBook_id());
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setYear_publication(dto.getYear_publication());
        book.setQuantity(dto.getQuantity());
        book.setPrice(dto.getPrice());
        book.setRetail_margin(dto.getRetail_margin());
        book.getDemand_rating(dto.getDemand_rating());
        repository.save(book);
    }
}
