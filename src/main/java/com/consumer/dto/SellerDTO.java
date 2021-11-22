package com.consumer.dto;

import javax.persistence.Entity;

import com.consumer.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SellerDTO {

	private int id;
	private String name;

}