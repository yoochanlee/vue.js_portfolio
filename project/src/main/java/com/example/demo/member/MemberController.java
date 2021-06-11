package com.example.demo.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@PostMapping("")
	public Map join(Member m) {
		Map map = new HashMap();
		
		boolean result = false;
		
		try {
			service.join(m);
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("result", result);
		
		return map;
	}
}
