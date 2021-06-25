/* select * from member;

CREATE SEQUENCE product_seq --시퀀스이름 EX_SEQ
INCREMENT BY 1 --증감숫자 1
START WITH 1;

select product_seq.CURRVAL FROM s_product;

SELECT * FROM USER_SEQUENCES;

insert into s_member values(member_seq.NEXTVAL,'admin','관리자','admin',2,'admin@gmail.com','010-1111-2222','서울시 한남동 한남더힐 101동 101호');
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
	
create table s_cart
(	
	c_idx number , 
	m_idx number ,
	p_idx number ,
	c_amount number ,
	c_pay number ,
	c_date date ,
	c_deliver number 	

);

SELECT DISTINCT (emp.deptno), dept.deptno AS 팀번호
FROM dept LEFT OUTER JOIN emp
ON emp.deptno = dept.deptno;
 

SELECT p.p_price,p.p_img,p.p_name, c.*
FROM s_cart c LEFT OUTER JOIN s_product p
ON c.p_idx = p.p_idx where c.m_idx = 31;
 	


ALTER TABLE s_cart ADD CONSTRAINT s_cart_pk PRIMARY KEY (c_idx);

ALTER TABLE s_cart
ADD CONSTRAINTS s_member_fk1 FOREIGN KEY (m_idx) 
REFERENCES s_member(m_idx);

ALTER TABLE s_cart
ADD CONSTRAINTS s_product_fk FOREIGN KEY (p_idx) 
REFERENCES s_product(p_idx); 

ALTER TABLE 테이블명 
ADD CONSTRAINTS 외래키 이름 FOREIGN KEY (참조컬럼) 
REFERENCES 참조 테이블명(참조컬럼)

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
select * FROM (select * from s_product) where rownum <=8 order by p_hit desc;
ALTER TABLE s_product MODIFY (p_img DEFAULT 'nofile');
ALTER TABLE s_cart MODIFY (c_pay DEFAULT 0);
ALTER TABLE s_product ADD(p_deliver number DEFAULT 0);
ALTER TABLE s_product ADD(p_hit number DEFAULT 0);
ALTER TABLE s_product ADD(p_name1 varchar2(500) DEFAULT 'noname'); 
delete from s_product;
delete from s_cart;
delete from s_member;
select * from s_product order by p_hit desc;
INSERT INTO s_member (컬럼1, 컬럼2, 컬럼3......) 
VALUES (값1, 값2, 값3......)
select * from s_member;
insert into s_member ()
ALTER TABLE s_product MODIFY(p_name VARCHAR2(4000));
select * from s_member;
ALTER TABLE s_member MODIFY (m_id NOT NULL);
ALTER TABLE s_member MODIFY (m_name NOT NULL);
ALTER TABLE s_member MODIFY (m_pwd NOT NULL);
ALTER TABLE s_member MODIFY (m_grade NOT NULL);
ALTER TABLE s_member MODIFY (m_phone NOT NULL);
ALTER TABLE s_member MODIFY (m_addr NOT NULL);

drop sequence Product_seq;
drop sequence member_seq;
drop sequence cart_seq;

SELECT LAST_NUMBER 
FROM USER_SEQUENCES 
WHERE SEQUENCE_NAME = "CART_SEQ";

ALTER SEQUENCE CART_SEQ INCREMENT BY -19;

SELECT CART_SEQ.NEXTVAL 
  FROM DUAL

SELECT CART_SEQ.CURRVAL 
FROM DUAL;

ALTER SEQUENCE TB_ZZTRACE_SQ01 INCREMENT BY 1



 */