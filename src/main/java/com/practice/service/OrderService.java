package com.practice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.model.Meal;
import com.practice.model.Order;

@Service
public class OrderService {

	List<Order> orderList = new ArrayList();

	public OrderService() {
		super();
		List<Meal> meals = new ArrayList();
		meals.add(new Meal("hamburger", 123, "This is delicious"));
		this.orderList.add(new Order("1", 1000, "Bill", meals));
		this.orderList.add(new Order("2", 2000, "Bill", meals));
	}

	public Order getOrderBySeq(String seq) {
		for (int i = 0; i < this.orderList.size(); i++) {
			if (this.orderList.get(i).getSeq().equals(seq)) {
				return this.orderList.get(i);
			}
		}
		return null;
	}

	public int getIncome() {
		int income = 0;
		for (int i = 0; i < this.orderList.size(); i++) {
			income += this.orderList.get(i).getTotalPrice();
		}
		return income;
	}

}
