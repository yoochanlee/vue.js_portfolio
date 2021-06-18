/* select * from member;

CREATE SEQUENCE product_seq --시퀀스이름 EX_SEQ
INCREMENT BY 1 --증감숫자 1
START WITH 1;
select product_seq.CURRVAL FROM s_product;
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
insert into s_member values(member_seq.NEXTVAL,'admin','admin','admin',2,'admin@gmail.com','010-1235-1235','admin address');
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
select product_seq.currval FROM DUAL;
ALTER TABLE s_product
ALTER TABLE s_product MODIFY (p_img DEFAULT 'nofile');
delete from s_product where p_img = '59.jpg';

ADD CONSTRAINTS s_member_fk FOREIGN KEY (m_idx) 
REFERENCES s_member(m_idx); 
select * from s_product order by p_idx;
INSERT INTO s_member (컬럼1, 컬럼2, 컬럼3......) 
VALUES (값1, 값2, 값3......)
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