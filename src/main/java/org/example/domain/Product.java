package org.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

//@Entity
//@Table(name = "user")
public class Product {

	public Product() {
		
	}


//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Id
//	@Column(name = "id", unique = true, nullable = false)
	private Long id;

//	@CreationTimestamp
	private Date buydate;

	private String product;

	private int price ;
	
	private String buyer ;
	
	private String phone ;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	 
	public Date getBuydate() {
		return buydate;
	}

	public void setbuydate(Date buydate) {
		this.buydate = buydate;
	}

	 
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	 
	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	
	 
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}