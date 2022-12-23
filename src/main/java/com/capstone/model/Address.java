package com.capstone.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_ecom")
public class Address {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private Integer addressId;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	
	@Column(name="country")
	private String country;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="isShipping")
	private Boolean isShipping;
	
	@Column(name="isBilling")
	private Boolean isBilling;
	
// //ThIS LINKS TO CORRESPONDING USER
// @ManyToOne(fetch = FetchType.LAZY)
// @JoinColumn(name = "userID", nullable=false)
// private User user;
	
	@ManyToOne
	@JoinColumn(name ="userId")
	private User user;
}
