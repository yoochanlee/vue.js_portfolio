package com.example.demo.product;

public class Product {
	int p_idx;
	String p_name;
	String p_category;
	int p_price;
	int p_amount;
	String p_img;
	String p_info;
	public Product() {}
	
	public Product(int p_idx, String p_name, String p_category, int p_price, int p_amount, String p_img,
			String p_info) {
		this.p_idx = p_idx;
		this.p_name = p_name;
		this.p_category = p_category;
		this.p_price = p_price;
		this.p_amount = p_amount;
		this.p_img = p_img;
		this.p_info = p_info;
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

	@Override
	public String toString() {
		return "product [p_idx=" + p_idx + ", p_name=" + p_name + ", p_category=" + p_category + ", p_price=" + p_price
				+ ", p_amount=" + p_amount + ", p_img=" + p_img + ", p_info=" + p_info + "]";
	}
	
}
