const titles = document.querySelectorAll('li'); 

const TL1 = new TimelineMax({paused: true});


TL1
.staggerFrom(allItems, 1, {y: -50, opacity: 0}, 0.2, '-=1')

TL1.play();