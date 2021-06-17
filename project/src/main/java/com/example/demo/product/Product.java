package com.example.demo.product;

import org.springframework.web.multipart.MultipartFile;

public class Product {
	int p_idx;
	String p_name;
	String p_category;
	int p_price;
	int p_amount;
	String p_img;
	String p_info;
	private MultipartFile files[];
	int m_idx;
	public Product() {}
	
	

	public MultipartFile[] getFile() {
		return files;
	}



	public void setFile(MultipartFile[] file) {
		this.files = file;
	}



	public Product(int p_idx, String p_name, String p_category, int p_price, int p_amount, String p_img, String p_info,
			MultipartFile[] files, int m_idx) {
		super();
		this.p_idx = p_idx;
		this.p_name = p_name;
		this.p_category = p_category;
		this.p_price = p_price;
		this.p_amount = p_amount;
		this.p_img = p_img;
		this.p_info = p_info;
		this.files = files;
		this.m_idx = m_idx;
	}



	public int getP_idx() {
		return p_idx;
	}

	public void setP_idx(int p_idx) {
		this.p_idx = p_idx;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_category() {
		return p_category;
	}

	public void setP_category(String p_category) {
		this.p_category = p_category;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public int getP_amount() {
		return p_amount;
	}

	public void setP_amount(int p_amount) {
		this.p_amount = p_amount;
	}

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}

	public String getP_info() {
		return p_info;
	}

	public void setP_info(String p_info) {
		this.p_info = p_info;
	}
	

	public int getM_idx() {
		return m_idx;
	}

	public void setM_idx(int m_idx) {
		this.m_idx = m_idx;
	}

}