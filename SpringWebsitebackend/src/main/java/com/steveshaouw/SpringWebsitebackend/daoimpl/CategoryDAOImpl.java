package com.steveshaouw.SpringWebsitebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.steveshaouw.SpringWebsitebackend.dao.CategoryDAO;
import com.steveshaouw.SpringWebsitebackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Televison");
		category1.setDescription("This is the description fot television");
		category1.setImageURL("Cat_1.png");
		categories.add(category1);
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Mobile");
		category2.setDescription("This is the description fot Mobile");
		category2.setImageURL("Cat_2.png");
		categories.add(category2);
		
		Category category3 = new Category();
		category3.setId(3);
		category3.setName("PC");
		category3.setDescription("This is the description fot PC");
		category3.setImageURL("Cat_3.png");
		categories.add(category3);
		
		
	}
	@Override
	public List<Category> list() {
		
		return categories;
	}
	@Override
	public Category get(int id) {
		
		for(Category category : categories) {
			if(category.getId()==id) return category;
		}
		return null;
	}


}
