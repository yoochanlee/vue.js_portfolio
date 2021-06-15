package com.example.demo.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@GetMapping("/{m_id}")//id로 하나 검색. json반환(처리결과(result:true/false), 검색 결과 Member객체(m))
	public Map getMember(@PathVariable("m_id") String m_id) {
		Map map = new HashMap();
		boolean result = false;
		Member m = null;
		try {
			m = service.getMember(m_id);
			if(m!=null) {
			result = true;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		map.put("result", result);
		map.put("m", m);
		return map;
	}


	@PutMapping("/{m_idx}")//수정. json반환(처리결과(result:true/false))
	public Map editMember(Member m) {
		Map map = new HashMap();
		boolean result = false;
		try {
			service.editMember(m);
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		map.put("result", result);
		return map;
	}

	@DeleteMapping("/{m_idx}")//삭제. json반환(처리결과(result:true/false))
	public Map delMember(@PathVariable("m_idx") int m_idx) {
		Map map = new HashMap();
		boolean result = false;
		try {
			service.delMember(m_idx);
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("result", result);
		return map;
	}
}
