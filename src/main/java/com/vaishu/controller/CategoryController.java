package com.vaishu.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaishu.model.Category;
import com.vaishu.repository.CategoryRepository;
import com.vaishu.service.CategoryService;

@RequestMapping("/api")
@RestController
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CategoryService categoryService;

	@PostMapping("/cat")
	public Category addCategory(@RequestBody Category category) {
		return categoryService.addCategoryService(category);
	}

	@GetMapping("/cat/{id}")
	public Optional<Category> getCategory(@PathVariable Long id) {
		return categoryService.getCategoryService(id);
	}

	@GetMapping("/std")
	public List<Category> getAllcategory() {
		return categoryService.getAllCategoryService();
	}

	@DeleteMapping("/std/{id}")
	public String deleteCategory(@PathVariable Long id) {
		return categoryService.deleteCategoryService(id);
	}

	@PutMapping("/std/{id}")
	public Category updateCategory(@PathVariable Long id, @PathVariable String name) {
		return categoryService.updateCategoryService(id, name);
	}

}
