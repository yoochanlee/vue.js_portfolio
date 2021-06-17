package com.example.demo.product;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.member.Member;

@Service
public class ProductService {

	@Autowired
	private ProductDao dao;
	
	public int join(Product p) {
		 return dao.insert(p);
	}
	public ArrayList<Product> getAll(){
		return dao.selectAll();
	}
	public Product getProduct(int p_idx) {
		return dao.select(p_idx);
	}
	public void editProduct(Product p) {
		dao.update(p);
	}
	public void delProduct(int p_idx) {
		dao.delete(p_idx);
	}
}
