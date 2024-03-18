const tilt =document.querySelector('.tilt')
function toggleItem(){
    tilt.classList.toggle('active');
}

(function iife(d){
    const viewer = d.querySelectorAll('.viewer'),
    scene = d.querySelectorAll('.tilt');

    d.querySelector('body').classList.add('blur');

    scene.forEach((item,index)=>{
        var halfViewer = viewer[index].offsetWidth / 2;
        var rect = e.target.getBoundingClientReact();
        var x = e.clientX - rect.left - halfViewer;
        var y = e.clientY - rect.top - halfViewer;
        viewer[index].style.transform = 'translate(' + x + 'px,' + y + ')'
        viewer[index].style.backgroundPosition= -x + 'px' + ' ' + -y +;
    });
});
