var msg = 'Sign up to recieve our newsletter for 10% off!';

function updateMassage(){
    var el = document.getElementById('message');
    el.textContent = msg;
}

function updateMassage2(iMess){
    var el = document.getElementById('message');
    el.textContent = iMess;
}

updateMassage2('ahihi');