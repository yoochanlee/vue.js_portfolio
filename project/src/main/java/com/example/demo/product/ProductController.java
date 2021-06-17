package com.example.demo.product;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
		    if (i < f.length-1) {
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
	
	@PutMapping("")
	public Map editProduct(Product p) {
		Map map = new HashMap();
		Product pp = service.getProduct(p.getP_idx());
		pp.setP_name(p.getP_name());
		pp.setP_price(p.getP_price());
		pp.setP_amount(p.getP_amount());
		pp.setP_category(p.getP_category());
		pp.setP_info(p.getP_info());
		pp.setP_img(p.getP_img());
		
		boolean result = true;
		try {
			service.editProduct(pp);
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		map.put("result", result);
		return map;
	}
	
	@GetMapping("/{m_idx}")
	public Map getProduct1(@PathVariable("m_idx") int m_idx) {
		Map map = new HashMap();
		boolean result = false;
		Product p = null;
		try {
			p = service.getProduct1(m_idx);
			if (p != null) {
				result = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("result", result);
		map.put("p", p);
		return map;
	}
}
