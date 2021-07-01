package com.example.demo.cart;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CartDao {
	// 한사람 추가 insert()
		@Insert("insert into s_cart values(cart_seq.NEXTVAL,#{m_idx},#{p_idx},#{c_amount},#{p_price},sysdate,#{c_deliver})")
		void insert(Cart c);

	@Select("SELECT p.p_price,p.p_img,p.p_name,p.p_deliver, c.* FROM s_cart c LEFT OUTER JOIN s_product p ON c.p_idx = p.p_idx where c.m_idx = #{m_idx}")
		ArrayList<Cart> select(@Param("m_idx") int m_idx);

		// 한사람 수정 update(member m) id로 검색해서 pwd 수정
		@Update("update s_cart set c_amount=#{c_amount} where c_idx=#{c_idx}")
		void update(Cart c);

		// 한사람 삭제 delete(String id) id로 검색해서 삭제
		@Delete("delete from s_cart where c_idx=#{c_idx}")
		void delete(@Param("c_idx") int c_idx);
}
