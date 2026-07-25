package com.PerfumeStore.PerfumeStore.modules.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PerfumeStore.PerfumeStore.modules.category.domain.Category;
import com.PerfumeStore.PerfumeStore.modules.category.dto.CategoryDto;
import com.PerfumeStore.PerfumeStore.modules.category.mapper.CategoryMapper;
import com.PerfumeStore.PerfumeStore.modules.category.repository.CategoryRepository;
import com.PerfumeStore.PerfumeStore.shared.exception.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryService {
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryMapper categoryMapper;

    public List<CategoryDto> getAll(String arabicName) {
        List<Category> categories = categoryRepository.findAll(arabicName);
        return categoryMapper.toDto(categories);
    }

    public CategoryDto getById(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Category.class.getSimpleName(), id));
        return categoryMapper.toDto(category);
    }

    public Category getReferenceById(Long id) {
        return categoryRepository.getReferenceById(id);
    }

    public CategoryDto save(CategoryDto dto) {
        Category category = categoryMapper.toEntity(dto);
        Category savedCategory = categoryRepository.save(category);
        return categoryMapper.toDto(savedCategory);
    }

    public void update(Long id, CategoryDto dto) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Category.class.getSimpleName(), id));
        Category entity = categoryMapper.updateEntityFromDto(dto, category);
        categoryRepository.save(entity);
    }

    public void delete(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Category.class.getSimpleName(), id));
        categoryRepository.delete(category);
    }
}