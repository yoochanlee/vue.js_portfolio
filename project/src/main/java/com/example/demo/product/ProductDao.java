package com.example.demo.product;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.member.Member;

@Mapper
public interface ProductDao {
			// 상품 1개 추가 insert()
			@Insert("insert into p_member values(product_seq.NEXTVAL,#{p_name},#{p_category},#{p_price},#{p_amount},#{p_img},#{p_info})")
			void insert(Product p);

			// 상품 1개 검색
			@Select("select * from p_member where p_name=#{p_name}")
			Product select(@Param("p_name") String p_name);

			// 상품 수정 
			@Update("update p_member set p_name=#{p_name}, p_category=#{p_category}, p_price=#{p_price}, p_amount=#{p_amount}, p_img=#{p_img}, p_info=#{p_info}"
					+ "  where p_idx=#{p_idx}")
			void update(Product p);

			// 상품 삭제
			@Delete("delete from p_member where p_idx=#{p_idx}")
			void delete(@Param("p_idx") int p_idx);
}
