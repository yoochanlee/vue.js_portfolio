package com.example.demo.product;

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
	public Product getProduct(int m_idx) {
		return dao.select(m_idx);
	}
	public Product getProduct1(int m_idx) {
		return dao.select1(m_idx);
	}
	public void editProduct(Product p) {
		dao.update(p);
	}
	public void delProduct(int p_idx) {
		dao.delete(p_idx);
	}
}
