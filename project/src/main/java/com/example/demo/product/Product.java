package com.example.demo.product;

import org.springframework.web.multipart.MultipartFile;

public class Product {
	int p_idx;
	String p_name;
	String p_id;
	String p_category;
	int p_price;
	int p_amount;
	MultipartFile p_img;
	String p_info;
	String img_path;
	public Product() {}
	
	public Product(int p_idx, String p_name, String p_id, String p_category, int p_price, int p_amount, MultipartFile p_img,
			String img_path, String p_info) {
		this.p_idx = p_idx;
		this.p_name = p_name;
		this.p_id = p_id;
		this.p_category = p_category;
		this.p_price = p_price;
		this.p_amount = p_amount;
		this.img_path = img_path;
		this.p_info = p_info;
		this.p_img = p_img;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public String getImg_path() {
		return img_path;
	}

	public void setImg_path(String img_path) {
		this.img_path = img_path;
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

	public MultipartFile getP_img() {
		return  p_img;
	}

	public void setFile(MultipartFile  p_img) {
		this. p_img =  p_img;
	}

	public String getP_info() {
		return p_info;
	}

	public void setP_info(String p_info) {
		this.p_info = p_info;
	}

	@Override
	public String toString() {
		return "Product [p_idx=" + p_idx + ", p_name=" + p_name + ", p_id=" + p_id + ", p_category=" + p_category
				+ ", p_price=" + p_price + ", p_amount=" + p_amount + ", p_img=" + p_img + ", p_info=" + p_info
				+ ", img_path=" + img_path + ", getP_id()=" + getP_id() + ", getImg_path()=" + getImg_path()
				+ ", getP_idx()=" + getP_idx() + ", getP_name()=" + getP_name() + ", getP_category()=" + getP_category()
				+ ", getP_price()=" + getP_price() + ", getP_amount()=" + getP_amount() + ", getP_img()=" + getP_img()
				+ ", getP_info()=" + getP_info() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
