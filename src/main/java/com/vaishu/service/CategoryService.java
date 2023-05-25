package com.vaishu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaishu.model.Category;
import com.vaishu.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category addCategoryService(Category category) {
		return categoryRepository.save(category);
	}

	public Optional<Category> getCategoryService(Long id) {
		return categoryRepository.findById(id);
	}

	
	public List<Category> getAllCategoryService() {
		return categoryRepository.findAll();
	}

	public String deleteCategoryService(Long id) {
		 categoryRepository.deleteById(id);
		 return "Details of student of id "+ id+ " has been deleted";
	}

	public Category updateCategoryService(Long id, String name) {
		Optional<Category> category = categoryRepository.findById(id);
		Category cat = category.get();
		  cat.setName(name);
		return categoryRepository.save(cat);
	}

	
}
