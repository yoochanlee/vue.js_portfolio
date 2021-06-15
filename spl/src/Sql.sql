/* select * from member;

CREATE SEQUENCE product_seq --시퀀스이름 EX_SEQ
INCREMENT BY 1 --증감숫자 1
START WITH 1;

create table s_member
(
	m_idx number ,
	m_id varchar2(50)  not null,
	m_name varchar2(20) not null,
	m_pwd varchar2(30) not null,
	m_grade number not null,
	m_email varchar2(50)not null,
	m_phone varchar2(50)not null,
	m_addr varchar2(50) not null
	

);
create table s_product
(
	p_idx number ,
	p_name varchar2(255) not null,
	p_category varchar2(255) not null,
	p_price number not null,
	p_amount number not null,
	p_img varchar2(2000) not null,
	p_info varchar2(3000) not null
);

ALTER TABLE s_product 

ADD CONSTRAINTS s_member_fk FOREIGN KEY (p_idx) 

REFERENCES s_member(m_idx);

select * from s_product;

ALTER TABLE s_member MODIFY(m_addr VARCHAR2(4000));
select * from s_member;
ALTER TABLE s_member MODIFY (m_id NOT NULL);
ALTER TABLE s_member MODIFY (m_name NOT NULL);
ALTER TABLE s_member MODIFY (m_pwd NOT NULL);
ALTER TABLE s_member MODIFY (m_grade NOT NULL);
ALTER TABLE s_member MODIFY (m_phone NOT NULL);
ALTER TABLE s_member MODIFY (m_addr NOT NULL);
ALTER TABLE s_product ADD CONSTRAINT s_product_pk PRIMARY KEY (p_idx);


 */