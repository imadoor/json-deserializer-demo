package com.example.demo.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.EquityOrdersParcer;
import com.example.demo.models.Hits;
import com.example.demo.models.HitsWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Service
public class DemoService {
	ObjectMapper mapper = new ObjectMapper();
	
	public Map<String, String> getEmployees(){
		
	    final String uri = "http://127.0.0.1:5000/store";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String response = restTemplate.getForObject(uri, String.class);
	    
	    Map<String, String> map = new HashMap<>();
	    
	    try {
	    	
	    	JsonNode root = mapper.readTree(response);
	    	JsonNode hitJSONObject = root.path("hits");
	    	JsonNode hitsJSONArray = hitJSONObject.path("hits");
	    	System.out.println(hitsJSONArray.isArray());
	    	System.out.println(hitsJSONArray);
	    	if(hitsJSONArray.isArray()) {
	    		for(JsonNode node: hitsJSONArray) {
	    			map.put(node.path("_source").path("order_type").toString(), node.path("_source").path("order_count").toString());
	    			System.out.println(node.path("_source").path("order_type"));
	    			System.out.println(node.path("_source").path("order_count"));
	    		}
	    	}
	    	System.out.println(map);
	    	return map;
			
		}
	    catch(Exception e){
	    	System.out.println(e);
	    }
		System.out.println("Response: "+response);
        
		return map;
	     
	   
	}

}