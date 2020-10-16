const navbar = document.querySelectorAll('.nav');
const title = document.querySelector('.titre1');
const capsule = document.querySelectorAll('.agence')
const img = document.querySelector('img');

const TL1 = new TimelineMax({paused: true});


TL1

.staggerFrom(navbar, 0.5, {y: -50, opacity: 0}, 0.2)
.from(title, 2, {x: 50, opacity: 0}, '-=0.2') 
.staggerFrom(capsule, 1, {x: -100, opacity: 0}, 0.2, '-=2')
.from(img, 2, {opacity:0}, '-=1.5')

//'-=2.5')



TL1.play(); 