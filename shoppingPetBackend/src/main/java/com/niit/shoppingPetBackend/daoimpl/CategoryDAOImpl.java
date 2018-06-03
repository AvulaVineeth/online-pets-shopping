package com.niit.shoppingPetBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingPetBackend.dao.CategoryDAO;
import com.niit.shoppingPetBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		//adding first category
		Category category = new Category();
		category.setId(1);
		category.setName("Dogs");
		category.setDescription("This is some new brand");
		category.setImageUrl("CAT_1.png");
		category.setActive(true);
		categories.add(category);
		
		//adding second category
		category = new Category();
		category.setId(2);
		category.setName("Cats");
		category.setDescription("This is some new brand");
		category.setImageUrl("CAT_2.png");
		category.setActive(true);
		categories.add(category);
		
		//adding third category
		category = new Category();
		category.setId(3);
		category.setName("Fish & Aquatics");
		category.setDescription("This is some new brand");
		category.setImageUrl("CAT_3.png");
		category.setActive(true);
		categories.add(category);
		
		//adding fourth category
		category = new Category();
		category.setId(4);
		category.setName("Birds");
		category.setDescription("This is some new brand");
		category.setImageUrl("CAT_3.png");
		category.setActive(true);
		categories.add(category);
		
	}
	
	

	@Override
	public List<Category> list() {
		
		return categories;
	}



	@Override
	public Category get(int id) {
		
		//enhanced for loop
		for(Category category : categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
