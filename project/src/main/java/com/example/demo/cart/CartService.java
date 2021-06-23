package com.example.demo.cart;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

	@Autowired
	private CartDao dao;
	
	public void join(Cart c) {
		dao.insert(c);
	}
	
	public ArrayList<Cart> getCart(int m_idx) {
		return dao.select(m_idx);
	}
}
