const navbar = document.querySelectorAll('.nav');
const title = document.querySelector('.titre1');

const TL1 = new TimelineMax({paused: true});


TL1

.staggerFrom(navbar, 0.5, {y: -50, opacity: 0}, 0.2)
.from(title, 5, {opacity: 0}) 

//'-=2.5')



TL1.play(); 