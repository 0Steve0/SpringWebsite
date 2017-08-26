package com.steveshaouw.SpringWebsitebackend.dao;

import java.util.List;

import com.steveshaouw.SpringWebsitebackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();	
	Category get(int id);
}
