package com.example.demo.product;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@Autowired
	ServletContext application;

	@Autowired
	HttpSession session;

	@Autowired
	HttpServletRequest request;
	
	private String base_path = "C:\\shop\\";
	
	@PostMapping("")
	public Map addProduct(Product p) {
		Map map = new HashMap();
		boolean result = true;
		String [] str = new String[50];
		File ff = null;
		StringBuffer sb = new StringBuffer();
		try {
			service.join(p);
			Product pp = service.getProduct(p.getP_idx());
			MultipartFile[] f = p.getFile();
			for(int i=0; i<f.length;i++) {
			str[i] = f[i].getOriginalFilename();	
			str[i] = str[i].substring(str[i].lastIndexOf('.'));
			ff = new File(base_path + pp.getP_idx()+i+str[i]);			
			f[i].transferTo(ff);
		    sb.append(ff.getName());
		    if(i<f.length-1) {
		    	sb.append("/");		    	
		    }
			}
			pp.setP_img(sb.toString());
			service.editProduct(pp);
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		map.put("result", result);
		return map;
	}
	@GetMapping("")
	public Map getAll() {
		Map map = new HashMap();
		boolean result = true;
		ArrayList<Product> list = null;
		try {
		 list = service.getAll();
			
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
	@GetMapping("/{num}")
	public Map getProduct(@PathVariable("num") int num) {
		Map map = new HashMap();
		boolean result = true;
		Product p = null;
		try {
			p = service.getProduct(num);
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		map.put("result", result);
		map.put("p", p);
		return map;
	}
	@PutMapping("/{p_idx}")
	public Map editProduct(Product p) {
		Map map = new HashMap();
		boolean result = true;
		try {
			service.editProduct(p);
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		map.put("result", result);
		return map;
	}
	@DeleteMapping("/{p_idx}")//삭제. json반환(처리결과(result:true/false))
	public Map delMember(@PathVariable("p_idx") int p_idx) {
		Map map = new HashMap();
		boolean result = false;
		try {
			service.delProduct(p_idx);
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("result", result);
		return map;
	}
}
