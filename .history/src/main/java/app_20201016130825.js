const titre = document.querySelector('#LOCALISATION');

const TL1 = new TimelineMax({paused: true});


TL1
.from(titre, 1, {x: -100, opacity: 0})


TL1.play(); 