package com.steveshaouw.SpringWebsitebackend.dao;

import java.util.List;

import com.steveshaouw.SpringWebsitebackend.dto.Category;

public interface CategoryDAO {
	
	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
}
