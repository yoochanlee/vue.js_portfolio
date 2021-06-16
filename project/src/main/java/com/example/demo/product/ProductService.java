package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.member.Member;

@Service
public class ProductService {

	@Autowired
	private ProductDao dao;
	
	public Product join(Product p) {
		return dao.insert(p);
	}
	public Product getProduct(String p_name) {
		return dao.select(p_name);
	}
	public void editProduct(Product p) {
		dao.update(p);
	}
	public void delProduct(int p_idx) {
		dao.delete(p_idx);
	}
}
