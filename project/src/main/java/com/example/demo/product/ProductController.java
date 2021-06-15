package com.example.demo.product;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.member.Member;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("")
	public Map join(Product p) {
		Map map = new HashMap();
		boolean result = false;
		try {
			service.join(p);
			result = true;
		}catch(Exception e) {
			System.out.println(e);

		}
		map.put("result", result);
		return map;
	}
}
