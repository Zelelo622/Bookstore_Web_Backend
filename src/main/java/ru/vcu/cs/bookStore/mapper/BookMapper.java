package ru.vcu.cs.bookStore.mapper;

import org.mapstruct.Mapper;
import ru.vcu.cs.bookStore.dto.BookDto;
import ru.vcu.cs.bookStore.entity.Book;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDto toDto(Book book);

    Book toEntity(BookDto dto);
}
