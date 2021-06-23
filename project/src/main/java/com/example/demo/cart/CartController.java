package com.example.demo.cart;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	CartService service;
	
	private String base_path = "C:\\shop\\";

	@PostMapping("") // Member db에 저장. json반환(처리결과(result:true/false))
	public Map join(Cart c) {
		Map map = new HashMap();
		boolean result = false;
		try {
			service.insert(c);
			result = true;
		} catch (Exception e) {
			System.out.println(e);

		}
		map.put("result", result);
		return map;
	}

	@GetMapping("/{num}")
	public Map getAll(@PathVariable("num") int m_idx) {
		Map map = new HashMap();
		boolean result = true;
		ArrayList<Cart> list = null;
		try {
			list = service.getAll(m_idx);
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		map.put("result", result);
		map.put("list", list);
		return map;
	}
	@GetMapping("/img/{img}")
	public ResponseEntity<byte[]> img(@PathVariable("img") String p_img) {
		File f = new File(base_path + p_img);
		HttpHeaders header = new HttpHeaders();
		ResponseEntity<byte[]> result = null;

		try {
			header.add("Content-Type", Files.probeContentType(f.toPath()));// 이 페이지의 마임타입 지정
			result = new ResponseEntity<byte[]>(FileCopyUtils.copyToByteArray(f), header, HttpStatus.OK);
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	@DeleteMapping("/{c_idx}") // 삭제. json반환(처리결과(result:true/false))
	public Map delMember(@PathVariable("c_idx") int c_idx) {
		Map map = new HashMap();
		boolean result = false;
		try {
			service.delete(c_idx);
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("result", result);
		return map;
	}
}
