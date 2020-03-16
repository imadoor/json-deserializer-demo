package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class EquityOrdersParcer {
	
	@JsonProperty("hits")
	private HitsWrapper hitsWrapper;
}
