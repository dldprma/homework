// popup창
const popup = document.querySelector('#popup');
popup.addEventListener('click',function(){
    open('./resource/img/Screen Shot 2022-10-24 at 5.03.11 PM.png','pmh', 'width=500, height=500, left=500, top=200')
})

// 슬라이더
const slideWrap = document.querySelector(".slide-wrap");
// 보여지는 영역
const sliderfix = slideWrap.querySelector(".slider");
// 움직이는 영역
const sliderPic = slideWrap.querySelector(".slider-pic");
// 개별 이미지
const slider = slideWrap.querySelectorAll(".slide");

// 현재 보이는 이미지
let currentIndex = 0;
// 이미지 개수
let sliderCount = slider.length;
// 이미지 가로 값
let sliderWidth = slider[currentIndex].offsetWidth;
// 복제할 첫 번째 이미지 (cloneNode는 복사해서 붙여넣음 안 쓰면 그냥 이동함)
let sliderClone = sliderPic.firstElementChild.cloneNode(true);

// 복사한 첫 번째 이미지 마지막에 붙여넣기
sliderPic.appendChild(sliderClone)

// 이미지 변경 간격
let sliderInterval = 1000;

function sliderEffect(){
    currentIndex++;

    sliderPic.style.transition = "all 0.6s";
    sliderPic.style.transform = `translateX(-${sliderWidth*currentIndex}px)`

    // 마지막 이미지가 나오면 애니메이션 효과 없이 처음으로 돌아가기
    if(currentIndex == sliderCount){
        setTimeout(() => {
            sliderPic.style.transition = "none";
            sliderPic.style.transform = `translateX(0px)`
            currentIndex = 0;
        }, 600);
    };
};
    // 2초마다 슬라이드 전환
    setInterval(sliderEffect, sliderInterval);

    // 창 크기 변경 시 슬라이드 너비 재계산
    window.addEventListener('resize', () => {
        sliderWidth = slider[currentIndex].offsetWidth;
    });

