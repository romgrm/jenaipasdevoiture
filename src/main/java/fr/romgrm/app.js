const navbar = document.querySelectorAll('.nav');
const anim = document.querySelectorAll('.anim'); 
const title = document.querySelector('.titre1');
const capsule = document.querySelectorAll('.agence')
const img = document.querySelector('#bmw');
//const cars = document.querySelector('.animate'); 

const TL1 = new TimelineMax({paused: true});


TL1

.staggerFrom(navbar, 0.5, {y: -50, opacity: 0}, 0.2)
.from(title, 2, {x: 50, opacity: 0}, '-=0.2') 
.staggerFrom(capsule, 1, {x: -100, opacity: 0}, 0.2, '-=2')
.from(img, 2, {x: 20, opacity:0}, '-=1.5')
.staggerFrom(anim, 0.5, {y: -50, opacity: 0}, 0.2, '-=1.5')





TL1.play(); 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*let tl = gsap.timeline({
    scrollTrigger: {
        trigger: "#SELECTCAR",
        start: "top top", 
        end : "+=500"
    }
});

tl.addLabel("start")
.from("#animate", {scale : 1.5, rotation: 45}); */

gsap.to("#animate", {
    scrollTrigger: "#SELECTCAR",
    x: 500
});
/*
gsap.registerPlugin(ScrollTrigger);
gsap.defaults({ease: "none", duration: 2}); 

const timeLine = gsap.timeline(); 
timeLine.from(".animate",{yPercent: 50, opacity: 1} );


ScrollTrigger.create({
    animation: timeLine, 
    trigger: ".animate", 
    start: "top top",
    //end: "+=4000",
    //scrub: true,
    //pin: true,
    //anticipatePin: 1
}); */

/*
gsap.to(".animate",{
    ScrollTrigger: {
    trigger : ".animate",
    markers: true,
    toggleActions: "play none none none"
    },
    .from opacity: 1,
    y: 20,
    duration : 2
}); */

