package ru.vcu.cs.bookStore.service;
import org.springframework.stereotype.Service;
import ru.vcu.cs.bookStore.dto.CategoryDto;
import ru.vcu.cs.bookStore.entity.Category;

import ru.vcu.cs.bookStore.mapper.CategoryMapper;
import ru.vcu.cs.bookStore.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository repository;
    private final CategoryMapper mapper;

    public CategoryService(CategoryRepository repository, CategoryMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    private Category findById(Integer id) {
        return repository.findAll().stream().filter(com -> com.getId().equals(id)).toList().get(0);
    }

    public void deleteCategory(Integer id) {
        repository.delete(findById(id));
    }

    public void addNewCategory(CategoryDto dto) {
        repository.save(mapper.toEntity(dto));
    }

    public List<Category> getAll() {
        return repository.findAll();
    }

    public CategoryDto getById(Integer id) {
        return mapper.toDto(findById(id));
    }

    public void editCategory(CategoryDto dto) {
        Category category = new Category();
        category.setId(dto.getId());
        category.setName(dto.getName());
        repository.save(category);
    }
}
