// Function to start the animations
function startAnimations() {
    animateBar('bar30', 30);
    animateBar('bar40', 40);
    animateBar('bar80', 80);
}

// Function to animate the bar to a given percentage
function animateBar(barId, percentage) {
    const bar = document.getElementById(barId);
    const fill = document.createElement('div');
    fill.className = 'fill';
    fill.style.height = '0%';
    bar.appendChild(fill);
    
    setTimeout(() => {
        fill.style.height = percentage + '%';
    }, 100);
}

// Start animations when the page loads
window.onload = startAnimations;
