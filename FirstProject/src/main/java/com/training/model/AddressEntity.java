package com.training.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="address", schema="app")
@Data
public class AddressEntity {
	
	@Id
	@Column
	private int addressid;

	@Column
	private String address;

	
}