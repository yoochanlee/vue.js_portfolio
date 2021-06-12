package com.example.demo.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/members")

public class MemberController {
	
	@Autowired
	private MemberService service;
	

	@PostMapping("")//Member db에 저장. json반환(처리결과(result:true/false))
	public Map join(Member m) {
		Map map = new HashMap();
		boolean result = false;
		try {
			service.join(m);
			result = true;
		}catch(Exception e) {
			System.out.println(e);

		}
		map.put("result", result);
		return map;
	}
}



