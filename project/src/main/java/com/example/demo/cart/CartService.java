package com.example.demo.cart;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
	
	@Autowired
	CartDao dao;
	
	public void insert(Cart c) {
		dao.insert(c);
	}
	
	public ArrayList<Cart> getAll(int m_idx){
		return dao.select(m_idx);
	}
	
	public void update(Cart c) {
		dao.update(c);
	}
	
	public void delete(int c_idx) {
		dao.delete(c_idx);
	}
}
