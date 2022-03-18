package com.webapp.InventoryProject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {

	@Id
	private int o_id;
	private String o_date;
	private int c_id;
	private int p_id;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int o_id, String o_date, int c_id, int p_id) {
		super();
		this.o_id = o_id;
		this.o_date = o_date;
		this.c_id = c_id;
		this.p_id = p_id;
	}
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public String getO_date() {
		return o_date;
	}
	public void setO_date(String o_date) {
		this.o_date = o_date;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	
	
}
