document.getElementById('btnOk').addEventListener('click',() => {
    let x = document.getElementById('num').value;
    let inverter = x.split('').reverse().join();
    document.write('O número ' + x + ' invertido é: ' + inverter);
});



