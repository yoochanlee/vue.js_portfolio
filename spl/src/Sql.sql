/* select * from member;

CREATE SEQUENCE member_seq --시퀀스이름 EX_SEQ
INCREMENT BY 1 --증감숫자 1
START WITH 1;

create table s_member
(
	m_idx number,
	m_id varchar2(50) ,
	m_name varchar2(20),
	m_pwd varchar2(30),
	m_grade number,
	m_email varchar2(50),
	m_phone varchar2(50),
	m_addr varchar2(50)
	

);

select * from s_member;
ALTER TABLE s_member MODIFY (m_id NOT NULL);
ALTER TABLE s_member MODIFY (m_name NOT NULL);
ALTER TABLE s_member MODIFY (m_pwd NOT NULL);
ALTER TABLE s_member MODIFY (m_grade NOT NULL);
ALTER TABLE s_member MODIFY (m_phone NOT NULL);
ALTER TABLE s_member MODIFY (m_addr NOT NULL);
ALTER TABLE s_member ADD CONSTRAINT s_member_pk PRIMARY KEY (m_idx);


 */