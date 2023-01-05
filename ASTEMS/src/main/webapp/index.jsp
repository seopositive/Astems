<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String logid = (String)session.getAttribute("logid");
%>     
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>아스템즈 메인</title>
    <link rel="stylesheet" href="./css/reset.css">
    <!-- 스와이퍼 CSS -->
    <link rel="stylesheet" href="./css/swiper-bundle.css">
</head>
<style>
    #wrap {
        width: 100%;
        margin: 0 auto;
    }

    .w1080 {
        width: 1080px;
        margin: 0 auto;
    }

    header {
        background-color: #f3ebeb;
    }

    header div h1 {
        font-size: 32px;
        font-weight: bold;
        padding: 20px;
        color: blue;
    }

    header div h1, ul{
        float: left;
    }

    header div ul {
        display: flex;
        flex-flow: row wrap;
        float: right;
        margin-top: 25px;
    }

    header div li {
        margin-left: 8px;
    }


    /* 헤드 2 */

    .head_2 div {
        display: flex;
        flex-flow: wrap;     
        justify-content: space-around;
        padding: 20px;
    }

    .head_2 div li {
        font-weight: 530;
        color: #272727;
    }

    .a2 {
        margin: 0 auto;
        width: 75%;
    }

    .a2 img {
        width: 100%;
        height: 100%;

    }
    
    .section_2 div {
        margin: 0 auto;
        width: 100%;

    }

    .section_2 div img {
        width: 100%;
        height: 100%;
    }

    .section_3 div ul { 
        display: flex;
        flex-flow: row wrap;
        justify-content: center;
        width: 100%;
        background-color: white;
}

    .section_2 {
        position: relative;
    }

    aside {
        position: absolute;
        top: 30%;
        left: 30%;
    }

    aside ul li:nth-child(1) {
        font-size: 55px;
        font-weight: 900;
        color: white;
        text-align: center;
    }

    aside ul li:nth-child(2) {
        color: white;
        margin-top: 20px;
        font-size: 22px;
    }

    footer {
        background-color: #273b42;
        color: white;
    }
    footer div {
        line-height: 150px;
    }


</style>
<body>
    <div id="wrap">
        <header>
            <div class="cf w1080">
            <h1>ASTEMS</h1>
            <ul>
<%
	if(logid == null){
%>
     			<a href="login.jsp">		
	                <li>로그인</li>
	            </a>
	            <a href="BoardListCtrl.do">
	                <li>게시판</li>
	            </a>
	            <a href="join.jsp">
	                <li>회원가입</li>
	            </a>
<%
}
%>              
            </ul>
            <ul>
<%
	if(logid != null) {
%>            
				<a href="logoutctrl.do">
	                <li>로그아웃</li>
	            </a>
	            <a href="BoardListCtrl.do">
	                <li>게시판</li>
	            </a>
	                <li>회원탈퇴</li>
<%
}
%>          
            </ul>
            </div>
        </header>
        <main role="main">
            <section class="head_2 w1080">
                <div>
                    <li>솔루션</li>
                    <li>하드웨어</li>
                    <li>유지보수</li>
                    <li>결제서비스</li>
                    <li>고객지원</li>
                    <li>회사소개</li>
                </div>
            </section>
            <section>                  
                <article class="a2">
                    <!-- 1. 스와이퍼 페이지 영역 -->
                    <div id="portfolio">
                        <!-- A. 스와이퍼 최상위 구조 클래스 -->
                        <h3><em></em></h3>
                        <div class="swiper-container">
                            <!-- B. 스와이퍼 될 Contents 부모 클래스 -->
                            <div class="swiper-wrapper">                                   
                                <div class="swiper-slide">
                                    <ul class="black_box">                                        
                                        <li>
                                            <img src="./images/img_slide_01.jpg" alt="">
                                        </li>
                                    </ul>
                                </div>                                      
                                <div class="swiper-slide">
                                    <ul class="black_box">
                                        <li>
                                            <img src="./images/img_slide_02.jpg" alt="">
                                        </li>
                                    </ul>
                                </div>                                                                          
                                <div class="swiper-slide">
                                    <ul class="black_box">
                                        <li>
                                            <img src="./images/img_slide_04.jpg" alt="">
                                        </li>
                                    </ul>
                                </div>                                      
                            </div>
                            <div class="swiper-button-next"></div>
                            <div class="swiper-button-prev"></div>
                            <!-- /B. 스와이퍼 될 Contents 부모 클래스 -->
                        </div>
                        <!-- /A. 스와이퍼 최상위 구조 클래스 -->                            
                    </div>
                    <!-- /1. 스와이퍼 페이지 영역 -->
                </article>
            </section>
            <section class="section_2">
                <div>
                    <img src="./images/img_service.jpg" alt="">
                </div>
                <aside>
                    <ul>
                        <li>유지보수</li>
                        <li>아스템즈는 다년간의 경험으로 최상의 유지보수 서비스를 제공합니다.</li>
                    </ul>
                </aside>
            </section>
            <section class="section_3">
                <div>
                    <ul>
                        <li>
                            <img src="./images/img_operating.jpg" alt="">
                        </li>
                        <li>
                            <img src="./images/img_question.jpg" alt="">
                        </li>
                        <li>
                            <img src="./images/img_recruit.jpg" alt="">
                        </li>                
                    </ul>
                </div>
            </section>
        </main>
        <footer>
            <div class="w1080">
                개인정보 처리방침&nbsp;&nbsp;
                상호 : (주)아스템즈 대표이사 : 박계영
            </div>
        </footer>
    </div>
</body>
</html>
<!-- 3. 제이쿼리 플러그인 추가 -->
<script src="./js/swiper-bundle.js"></script>
<!-- 본인 사이트에 맞게 속성값 변경 -->
<script src="./js/swiperCustom.js"></script>