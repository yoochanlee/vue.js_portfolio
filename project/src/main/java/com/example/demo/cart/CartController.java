package com.example.demo.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/carts")

public class CartController {

	@Autowired
	private CartService service;
	
	@PostMapping("")
	public Map join(Cart c) {
		Map map = new HashMap();
		boolean result = false;
		try {
			service.join(c);
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		map.put("result", result);
		return map;
	}
	
	@GetMapping("/{m_idx}")
	public Map getCart(@PathVariable("m_idx") int m_idx) {
		Map map = new HashMap();
		boolean result = false;
		ArrayList<Cart> c = null;
		try {
			c = service.getCart(m_idx);
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("result", result);
		map.put("c", c);
		return map;
	}
}
