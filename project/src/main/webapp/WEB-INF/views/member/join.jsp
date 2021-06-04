<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
/* 상단 로그 이미지 */
#img_top{
	display:block;
	margin: 0px auto;
	width: 1000px;
	height: 100px;
	box-sizing: border-box;
	opacity: 0.3;
}
/* 상단 sns 이미지 */
.top_sns{
	display: inline-block;
	margin: 0px 5px;
	width: 20px;
	height: 20px;
	box-sizing: border-box;
}
/* 맨위 */
.top{
	display:block;
	float:right;
	font-size:10pt;
	color: #999999;
	margin-right: 18px;
}
/* 회원가입 박스 */
.ul{
	border-top: 1px solid black;
	display: block;
	list-style: none;
}
.li{
	border-top: 1px solid #BDBDBD;
	border-bottom: 1px solid #BDBDBD;
	padding: 15px 0px;
}
/* 회원가입 박스 */
.box{
	display: inline-block;
	width: 300px;
	height: 40px;
	box-sizing: border-box;
	border: 1px solid #848484;
	
}
.box1{
	display: linline-block;
	width: 90px;
	height: 40px;
	box-sizing: border-box;
	border: 1px solid #848484;
	margin: 0px 4px;
}
/* 회원가입 폰트 */
.font{
	font-size: 14px;
	font-weight: bold;
	display: inline-block;
	width: 100px;
}
/* 약관동의 */
.border{
	border: 1px solid #BDBDBD;
}
/* 가입 박스 */
.box2{
	display: block;
	width: 400px;
	height: 100px;
	box-sizing: border-box;
	
}
</style>
<body>
	<div>
		<header>
			<div>
				<a href="http:naver.com">
					<img class=top_sns src="data:image/png;base64,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">
				</a>
				<a href="http:naver.com">
					<img class=top_sns src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBw0NDQ0QDQ4QDw4OEBANDQ8NDQ8OEBAPFhEYFhURExUYHSggGCYlGxYVIjIhJSkrLi4uGB8zRDYsNy4tLisBCgoKBQUFDgUFDisZExkrKysrKysrKysrKysrKysrKysrKysrKysrKysrKysrKysrKysrKysrKysrKysrKysrK//AABEIANsA5gMBIgACEQEDEQH/xAAcAAEAAgIDAQAAAAAAAAAAAAAABAgGBwEDBQL/xABCEAACAgECAgUHBwoGAwAAAAAAAQIDBAUREiEGBzE0c0FRYXGBsrMTFyJSkZOhCBRUVXKSlKLR0yM2U4KxwhUyM//EABQBAQAAAAAAAAAAAAAAAAAAAAD/xAAUEQEAAAAAAAAAAAAAAAAAAAAA/9oADAMBAAIRAxEAPwDYfWH05xtCxlOa+Vybd1jY6ls5tdspPyRW65lcekfT7V9SlJ5GXZGtvlTRJ01RXm4Y9vt3Y6yNelqWr5lzk3XGx0ULyRprfDHb17OXrkzGAOZSbe7bbfa3zZwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdlN863xVzlCXnhJxf2oz3ob1s6pp1kI5Fss3F5KdV8uKxR89dj5p+h7o18ALo6BrONqOLVlYs+Om1bxfY4tcnCS8jT5NA0F1F9L46fdmY+RNrHtrV8E+yN0ZKL29cZfyo5A1XKTbbfNvm36TgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAPuq2UHvFuL223XmB8AAAAAAAAAAAAAAAAAAAbV6tuqG3UYwytRc8fEltKqpLhuuX1ua+hF+ftf4garSbaSW7fJJdrZ7uB0M1fJSdOn5U0+x/ITin7XsWr0DoppumxUcPEqq22+nw8Vj9c5byf2ntAVOr6rekMuzTbP91tEf8AmZ05XVrr9Kbnpt+y5v5P5O33JMtsAKS5mFfjy4L6rKp/VtrlW/saI5dvNwaMiDhfVXbB9sbYRnH7GjAOk/VLoFtd13yU8NwhKyU8WfDFKKbb4Jbx7PNsBWMHL7eXZ5NzgAAAAAAAAAAAAAAAAAAAAAAAAAAANkdSnQqGq5sr8mHFh4bjKUZL6N1z5xrfnS23a9XnLMpbdnYvMYR1MaUsTQcLklPIUsqbS7eOT4P5OAzgAcnAA5BiXTPrD0zRWoZNkp5DjxrHojx2cPkcvJHf0vmYHZ+UBj8X0dNtcN+2WRCMtvUotfiBukwjrl1b8z0HMcXtO9RxYc9v/pLaX8ikRejHW9o+oSjXOcsO6XKMcraMJPfbZWL6Pl8uxhv5SOr7/wDjsSD3W08uzZ+f6Ff/AHA0eAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuf0YpVWnYMF2RxqIr7tHpkPRe6YvgU/DRMAHE5KKbfYk2/Ujkjak9se/0VWe4wKbdINVszszJyrG3PItnZz7Um/ox9i2XsPPAAHZdfZZw8c5T4IquHHJy4YLsjHfsXPsOsAAAAAAAAAAAAAAAAAAAAAAAAAAABvfq66rdH1HScTKyYXO61Tc3C9xjym0tlty5IyT5lNB/08j+Jl/Q9Lqa/y9p/7NnxZGagdePSq64QjvwwjGEd3u9orZb/AGHYAAPi6tThKEv/AFnFxltyezWzPsAa4XUnoH1Mj+Jf9B8yegfUyP4mX9DY4A1nl9TfR6mqyycMhQrhKyT/ADl8oxi232eZFbLnFzk4Jxi5NxTe7Ud+Sb8vItd1uan+aaDny32ldX+ax87dr4H+DkVOAAAAAAAAAAAAAAAAAAAAAAAAAAAC1vU1/l7T/wBmz4sjNSnendM9WxKYU42dfVTDfgrhPaMd3u9vaSfnD139Z5P3gFuwRdKnKWNjyk25SpqlJvtbcE2yUAAI+oTcaLnF7NV2NNdqai9mBIBUT5wtd/WeT94PnD139Z5P3gG1fyktTSxtPxU+dls8mS9EIOC39s2aDPQ1nW8zPnGebkWZE4R4IStlu4x3b2XtbPPAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALraN3TF8Cn4aJhD0bumL4FXw0TABG1Pu+R4VnuMkkXU+75HhWe4wKTgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAC62jd0xfAq+GiYQ9G7pi+BV8NEwARtT7vf4VnuMkkbU+75HhWe4wKTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAC62jd0xfAp+GiYQ9G7pi+BV8NEwARtT7vkeFZ7jJJF1Pu+R4VnuMCk4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuto3dMXwKvhomEPRu6YvgU/DRMAEbU+73+FZ7jJJF1Pu+R4VnuMCk4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAsHgdemlVUU1yxc1uuuFbahj7Nxik9v8T0Hf8/ek/omd+5j/wBwrqALFfP1pH6JnfuY/wDcOnL69dJsqtgsXNTnCcE3DH23cWuf+IV7AAAAAAAAAAAAAAAAAAAAAT9e0+WHmZWPNbSousqa9Ck0n9mxAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADKer3orZq+VdVCO6rpdsm+xPjjFL8X9gA2j139XduTOWp4Fbss4Us2mEd5yUVsroJdrSWzXoT85oZovCa061Oh+lzxrMl4dccjtdlfFU5PzyUGlJ+lgVoB3ZcFGyaitkm0kdIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJGBhXZNtdOPXO22x8MK64uUpP0JE7o1h1X5EYWx4ovblxSj5fQy1PQ7oxp2n0Qlh4tdU5wXHYk5WS9DnLeXs3A8vqp6ELRMJq3aWZk8M8qUeajtvw1RflS3frbfoBmwA/9k=">
				</a>
				<a href="http:naver.com">
					<img class=top_sns src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSb_lwtOCrq8p-lgRl_YK8hDjusEA7su8AznQ&usqp=CAU">
				</a>
				<a href="http:naver.com">
					<img class=top_sns src="data:image/png;base64,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">
				</a>
				<a class=top>고객센터</a>
				<a class=top>장바구니</a>
				<a class=top>마이페이지</a>
				<a class=top>회원가입</a>
				<a class=top>로그인</a>		
			</div>
			<div>
				<a href="file:///C:/Users/slinfo/eclipse-workspace6/TestPro/src/main/webapp/WEB-INF/aaza.html">
					<img id=img_top src="http://www.vekni.org/files/attach/images/39227/840/042/986027f50f02ddbf51417d799b3ff60a.png">
				</a>
			</div>
		</header>
		<div style="text-align: center">
			회원가입
		</div>
		<div>
			<ul class=ul>
				<li class=li>
				<label class=font>아이디</label>
					<input type="text" name="id" class=box>
				</li>
				<li class=li>
				<label class=font>비밀번호</label>
					<input type="password" name="pw" class=box>
				</li>
				<li class=li>
				<label class=font>비밀번호 확인</label>
					<input type="password" name="pw_ok" class=box>
				</li>
				<li class=li>
				<label class=font>이름</label>
					<input type="text" name="name" class=box>
				</li>
				<li class=li>
				<label class=font>이메일</label>
					<input type="text" name="email" class=box>
				</li>
				<li class=li>
				<label class=font>휴대폰번호</label>
					<input type="text" name="tel" class=box>
					<button>인증번호 받기</button>
				</li>
				<li class=li>
				<label class=font>SMS 인증번호</label>
					<input type="text" name="name" class=box>
					<button>인증번호 확인</button>
				</li>
			</ul>
			<ul style="padding: 20px 10px; list-style:none;">
				<li>
					<label style="font-size:15px; font-weight: bold;">
						<input type="checkbox" value="Y">
						" 14세 이상입니다."
						<font color="red">(필수)</font>
					</label>
				</li>
				<li style="margin-left:25px; font-size:12px;">
					회원가입에 필요한 최소한의 정보만 입력 받음으로써, 고객님의 개인정보 수집을 최소화하고
					편리한 회원가입을 제공합니다.
				</li>
			</ul>
		</div>
		<div>
			<div class=border style="font-weight: bold; height:20px;">
				<label>
					<input type="checkbox" name="aa" value="Y">
					전체동의
				</label>
			</div>
			<div class=border>
				<input type="checkbox" name="bb" value="Y">이용약관
				<input type="checkbox" name="cc" value="Y">개인정보 수집 및 이용 안내
				<input type="checkbox" name="dd" value="Y">개인정보 처리위탁
			</div>
			<div class=border>
				<input type="checkbox" name="ee" value="Y">마케팅 수신동의<br/><br/>
				쇼핑몰에서 제공하는 신상품 소식과 하일쿠폰을 무상으로 보내드립니다!<br/>
				단, 상품 구매 정보는 수신동의 여부 관계없이 발송됩니다.<br/>
				제공 동의를 하지 않으셔도 서비스 이용에는 문제가 없습니다.
			</div>
		</div>
		<button>가입하기</button>
	</div>
</body>
</html>