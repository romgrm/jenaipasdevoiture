const navbar = document.querySelector('.nav'); 

const TL1 = new TimelineMax({paused: true});


TL1
.from(navbar, 1, {y: -50, opacity: 0}, 0.2, '-=1'); 

TL1.play();