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
public class Source {
	
	@JsonProperty("event_timestamp")
	private String eventTimeStamp;
	
	@JsonProperty("order_count")
	private String orderCount;
	
	@JsonProperty("order_type")
	private String orderType;
}
