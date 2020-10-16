const navbar = document.querySelectorAll('.nav');
const title = document.querySelector('.titre1');

const TL1 = new TimelineMax({paused: true});


TL1
.staggerFrom(navbar, 1, {y: -50, opacity: 0}, 0.2, '-=1')
//.from(title, 1, {y: -50, opacity: 0}, 0.2, '-=1')


TL1.play(); 