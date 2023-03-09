package ru.vcu.cs.bookStore.service;
import org.springframework.stereotype.Service;
import ru.vcu.cs.bookStore.data.dto.CategoryDto;
import ru.vcu.cs.bookStore.data.entity.Category;

import ru.vcu.cs.bookStore.repository.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    private final CategoryRepository repository;
    private final MappingUtils mapper;

    public CategoryService(CategoryRepository repository, MappingUtils mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<CategoryDto> getAll() {
        return repository.findAll().stream().map(mapper::mapToCategoryDto).collect(Collectors.toList());
    }

    public CategoryDto getById(Integer id) {
        return mapper.mapToCategoryDto(repository.findById(id).get());
    }

    public void addNewCategory(CategoryDto buyer) {
        repository.save(mapper.mapToCategoryEntity(buyer));
    }

    public void deleteCategory(Integer id) {
        repository.deleteById(id);
    }

    public void updateCategory(CategoryDto category, Integer id) {
        Category oldCategory = repository.findById(id).get();
        Category newCategory = mapper.mapToCategoryEntity(category);
        newCategory.setCategory_id(oldCategory.getCategory_id());
        repository.save(newCategory);
    }
}
