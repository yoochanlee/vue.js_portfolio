package com.example.demo.product;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductDao dao;
	
	public int join(Product p) {
		 return dao.insert(p);
	}
	public Product getProduct(int m_idx) {
		return dao.select(m_idx);
	}
	public ArrayList<Product> getAll() {
		return (ArrayList<Product>) dao.getAll();
	}
	public void editProduct(Product p) {
		dao.update(p);
	}
	public void delProduct(int p_idx) {
		dao.delete(p_idx);
	}
}
