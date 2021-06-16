package com.example.demo.product;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;
	private String base_path = "C:\\shop\\";

	@PostMapping("")
	public Map join(Product p) {
		Map map = new HashMap();
		boolean result = false;
		try {
			Product pp = service.join(p);// 추가한 제품의 번호로 이미지 파일명
			MultipartFile f = p.getP_img();
			String fname = f.getOriginalFilename();// 업로드된 파일명 반환
			fname = fname.substring(fname.lastIndexOf('.'));
			File ff = new File(base_path + pp.getP_idx() + fname);// 상품번호.jpg
			f.transferTo(ff);
			pp.setImg_path(ff.getName());
			service.editProduct(pp);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put("result", result);
		return map;
	}
}
