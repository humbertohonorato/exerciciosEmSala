document.getElementById('btnOk').addEventListener('click', () => {

    let palavra = document.getElementById('word').value;
    let alfabetica = palavra.split('').sort().join('');

    document.write('A palavra ' + palavra + ' com as letras em orderm alfabética é: ' + alfabetica);

});