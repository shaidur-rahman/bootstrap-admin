package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.models.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

}
