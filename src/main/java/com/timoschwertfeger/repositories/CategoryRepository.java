package com.timoschwertfeger.repositories;

import org.springframework.data.repository.CrudRepository;

import com.timoschwertfeger.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

}
