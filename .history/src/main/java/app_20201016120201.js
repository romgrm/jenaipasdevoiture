const titre = document.querySelector('.unique');

const TL1 = new TimelineMax({paused: true});
window.addEventListener('load'); 


TL1
.from(titre, 1, {y: -20, opacity: 0})
//.staggerFrom(h2, 1, {y: -50, opacity: 0}, 0.2, '-=1')

TL1.play(); 