package ru.vcu.cs.bookStore.service;
import org.springframework.stereotype.Service;
import ru.vcu.cs.bookStore.entity.Category;

import ru.vcu.cs.bookStore.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    private Category findById(Integer id) {
        return repository.findAll().stream().filter(com -> com.getCategory_id().equals(id)).toList().get(0);
    }

    public void deleteCategory(Integer id) {
        repository.delete(findById(id));
    }

    public void addNewCategory(Category category) {
        repository.save(category);
    }

    public List<Category> getAll() {
        return repository.findAll();
    }

    public Category getById(Integer id) {
        return findById(id);
    }

    public void editCategory(Category category) {
        repository.save(category);
    }
}
