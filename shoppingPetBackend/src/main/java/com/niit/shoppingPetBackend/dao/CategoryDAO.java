package com.niit.shoppingPetBackend.dao;

import java.util.List;

import com.niit.shoppingPetBackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
}
