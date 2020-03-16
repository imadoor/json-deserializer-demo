package com.example.demo.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class HitsWrapper {

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("name")
	private String name;
	
	//@JsonProperty("hits")
	private List<Hits> hits;
	
	
//	@SuppressWarnings("unchecked")
//	@JsonProperty("hits")
//    private void unpackNested(Map<String,List<Hits>> hits) {
//        this.hits = (List<Hits>) hits.get("hits");
//        System.out.println("this.hits: "+this.hits);
        
        //System.out.println(this.users);
//        Map<String,String> owner = (Map<String,String>)brand.get("owner");
//        this.ownerName = owner.get("name");
   // }

}
