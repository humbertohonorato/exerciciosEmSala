// Corversor de centimetros,metros, quilometros 

document.getElementById('medida').addEventListener('keypress', function (event) {
    if (event.key == "Enter") {
        let valorDigitado = document.getElementById('medida').value;
        let centimetro = valorDigitado * 100;
        document.write('Medida em centímetros : ' + centimetro);
    }
    else if (event.code == 'Space') {
        alert('Tecla Inválida! Apague o espaço e digite um número! Em seguida pressione Enter!')
    }
})