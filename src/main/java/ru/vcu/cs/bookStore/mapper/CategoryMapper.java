package ru.vcu.cs.bookStore.mapper;

import org.mapstruct.Mapper;
import ru.vcu.cs.bookStore.dto.CategoryDto;
import ru.vcu.cs.bookStore.entity.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDto toDto(Category category);

    Category toEntity(CategoryDto dto);
}
