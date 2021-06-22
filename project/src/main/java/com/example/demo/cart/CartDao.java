package com.example.demo.cart;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CartDao {
	// 한사람 추가 insert()
		@Insert("insert into s_cart values(cart_seq.NEXTVAL,#{m_idx},#{p_idx},#{c_amount},#{c_pay},#{c_date},#{c_deliver})")
		void insert(Cart c);

		// 한사람 검색 select(String id) id로 검색
		@Select("select * from s_cart where m_idx=#{m_idx}")
		Cart select(@Param("m_idx") int m_idx);

		// 한사람 수정 update(member m) id로 검색해서 pwd 수정
		@Update("update s_cart set c_amount=#{c_amount} where c_idx=#{c_idx}")
		void update(Cart c);

		// 한사람 삭제 delete(String id) id로 검색해서 삭제
		@Delete("delete from s_member where c_idx=#{c_idx}")
		void delete(@Param("c_idx") int c_idx);

}