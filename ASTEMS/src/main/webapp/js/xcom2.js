window.onload = function() {

    /* 1. 문서객체 변수에 할당 */
    var btn = document.querySelector(".top_1");
    var contents = document.querySelector(".top_1 ul");


    // 2. Event Listener 작성

    /* 2-a. [기능]글자색 변경 */

    function WhenClick() {
        contents.style.display = "block";
    }

    function WhenClick2() {
        contents.style.display = "none";
    }


    /* 3. Event Dom에 EventListener 연결 */

    btn.addEventListener("mouseover", WhenClick); // 이벤트 종류, 함수명
    contents.addEventListener("mouseout", WhenClick2); // 이벤트 종류, 함수명


    /* 눈효과 */

    // 바디 불러오기
    const body = document.querySelector("body");
    // 최소 지속시간
    const MIN_DURATION = 10;

    
    function makesnow () {
        // 박스생성
        const snowflack = document.createElement("div");
        // 기타 값 설정
        const delay = Math.random() * 10;
        const opa = Math.random() + 0.2;
        const duration = Math.random() * 30 + MIN_DURATION;



        // 클래스 이름 설정
        snowflack.classList.add("snow");
        // 눈송이 위치 랜덤
        snowflack.style.left = `${Math.random() * window.screen.width}px`;
        // 지연값 - 시작은 같이하지만..? 떨어지는 시간과 다를 게 없는 것 같다. 굳이?
        snowflack.style.animationDelay = `${delay}s`
        // 투명도
        snowflack.style.opacity = `${opa}`
        // 애니메이션 떨어지는 시간
        snowflack.style.animation = `fall ${duration}s linear`;

        // 바디자식으로 만듦
        body.appendChild(snowflack);


        // 실행함수, 지연시간(밀리초) / 죽은 눈송이 삭제
        setTimeout(() => {
            body.removeChild(snowflack);
        }, (duration + delay) * 1000);
    }

    // 함수 100번 실행
    for(let i=0; i<500; i++){
        // 지연시간을 주며 실행
        setTimeout(makesnow, 350 * i);
    }



}


