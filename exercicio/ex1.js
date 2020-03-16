// Exercício de apresentação de um valor digitado utilizando método keypress

document.getElementById('number').addEventListener('keypress', function (event) {
    if (event.key == "Enter") {
        let valorDigitado = document.querySelector('input').value;
        document.write('O valor digitado pelo usúario foi : ' + valorDigitado);
    }
    else if (event.code == 'Space') {
        alert('Tecla Inválida! Apague o espaço e digite um número! Em seguida pressione Enter!')
    }
});