package com.practice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.model.Meal;

@Service
public class MealService {

	List<Meal> mealList = new ArrayList();

	public MealService() {
		super();
		this.mealList.add(new Meal("hamburger", 100, "This is delicious"));
	}

	public Meal getMealByName(String name) {
		for (int i = 0; i < this.mealList.size(); i++) {
			if (this.mealList.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
				return this.mealList.get(i);
			}
		}
		return null;
	}
}
