
const button = document.getElementById('btn');
const body = document.querySelector('body');
const colors = ['red', 'green', 'blue', 'yellow', 'pink', 'grey', 'lime','purple','brown','orange'];

body.style.backgroundColor = 'black';



button.addEventListener('click', () => {
    const colorIndex = parseInt(Math.random() * colors.length);
    body.style.backgroundColor = colors[colorIndex];
    body.style.transition = '1s linear';
});
