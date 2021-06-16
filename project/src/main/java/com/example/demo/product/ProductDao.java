package com.example.demo.product;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ProductDao {
			// 상품 1개 추가 insert()
			@Insert("insert into s_product (p_idx,p_name,p_category,p_price,p_amount,p_info,m_idx)values(product_seq.NEXTVAL,#{p_name},#{p_category},#{p_price},#{p_amount},#{p_info},#{m_idx})")
			@SelectKey(statement="select product_seq.currval FROM DUAL", keyProperty="p_idx", before=false, resultType=int.class)
			public int insert(Product p);
			
			
			// 상품 1개 검색
			@Select("select * from s_product where p_idx=#{p_idx}")
			Product select(@Param("p_idx") int p_idx);

			// 상품 수정 
			@Update("update s_product set p_name=#{p_name}, p_category=#{p_category}, p_price=#{p_price}, p_amount=#{p_amount}, p_img=#{p_img}, p_info=#{p_info}"
					+ "  where p_idx=#{p_idx}")
			void update(Product p);

			// 상품 삭제
			@Delete("delete from s_product where p_idx=#{p_idx}")
			void delete(@Param("p_idx") int p_idx);
}
