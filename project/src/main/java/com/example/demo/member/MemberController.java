package com.example.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/main")
	public void main() {
		
	}
	@GetMapping("/join")
	public void join() {
		
	}

}
