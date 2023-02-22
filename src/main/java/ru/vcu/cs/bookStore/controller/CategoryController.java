package ru.vcu.cs.bookStore.controller;

import org.springframework.web.bind.annotation.*;
import ru.vcu.cs.bookStore.dto.CategoryDto;
import ru.vcu.cs.bookStore.entity.Category;
import ru.vcu.cs.bookStore.service.CategoryService;

import java.util.List;

@RestController
public class CategoryController {
    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping("/category")
    public List<Category> getAllCategory() {
        return service.getAll();
    }

    @GetMapping("/category/{id}")
    public CategoryDto getCategoryById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @DeleteMapping("/category/delete/{id}")
    public void deleteCategory(@PathVariable Integer id) {
        service.deleteCategory(id);
    }

    @PostMapping("/category/new")
    public void addCategory(@RequestBody CategoryDto dto) {
        service.addNewCategory(dto);
    }

    @PutMapping("/category/edit")
    public void editCategory(@RequestBody CategoryDto dto) {
        service.editCategory(dto);
    }
}
