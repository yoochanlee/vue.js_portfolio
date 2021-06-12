package com.example.demo.member;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MemberDao {
	// 한사람 추가 insert()
	@Insert("insert into s_member values(member_seq.NEXTVAL,#{m_id},#{m_name},#{m_pwd},#{m_grade},#{m_email},#{m_phone},#{m_addr})")
	void insert(Member m);

	// 한사람 검색 select(String id) id로 검색
	@Select("select * from s_member where id=#{id}")
	Member select(@Param("id") String id);

	// 한사람 수정 update(member m) id로 검색해서 pwd 수정
	@Update("update s_member set pwd=#{pwd} where m_idx=#{m_idx}")
	void update(Member m);

	// 한사람 삭제 delete(String id) id로 검색해서 삭제
	@Delete("delete from s_member where m_idx=#{m_idx}")
	void delete(@Param("m_idx") int m_idx);

}
