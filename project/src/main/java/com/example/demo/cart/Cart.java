package com.example.demo.cart;

import java.util.Date;

public class Cart {

	private int c_idx;
	private int m_idx;
	private int p_idx;
	private int c_amount;
	private int c_pay;
	private Date c_date;
	private int c_deliver;

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(int c_idx, int m_idx, int p_idx, int c_amount, int c_pay, Date c_date, int c_deliver) {
		super();
		this.c_idx = c_idx;
		this.m_idx = m_idx;
		this.p_idx = p_idx;
		this.c_amount = c_amount;
		this.c_pay = c_pay;
		this.c_date = c_date;
		this.c_deliver = c_deliver;
	}

	public int getC_idx() {
		return c_idx;
	}

	public void setC_idx(int c_idx) {
		this.c_idx = c_idx;
	}

	public int getM_idx() {
		return m_idx;
	}

	public void setM_idx(int m_idx) {
		this.m_idx = m_idx;
	}

	public int getP_idx() {
		return p_idx;
	}

	public void setP_idx(int p_idx) {
		this.p_idx = p_idx;
	}

	public int getC_amount() {
		return c_amount;
	}

	public void setC_amount(int c_amount) {
		this.c_amount = c_amount;
	}

	public int getC_pay() {
		return c_pay;
	}

	public void setC_pay(int c_pay) {
		this.c_pay = c_pay;
	}

	public Date getC_date() {
		return c_date;
	}

	public void setC_date(Date c_date) {
		this.c_date = c_date;
	}

	public int getC_deliver() {
		return c_deliver;
	}

	public void setC_deliver(int c_deliver) {
		this.c_deliver = c_deliver;
	}

}
