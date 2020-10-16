const navbar = document.querySelector('.nav'); 

const TL1 = new TimelineMax({paused: true});

.from(navbar, 1, {y: -50, opacity: 0}, 0.2, '-=1'); 