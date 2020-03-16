document.getElementById('btnOk').addEventListener('click', () => {
    let word = document.getElementById('word').value;
    let arrayWord = word.split('');
    let arrayAuxiliar = arrayWord;
    let arrayCombinacao = [];
    let auxiliar = '';

    for (let i = 0; i < arrayAuxiliar.length; i++) {
        auxiliar = arrayAuxiliar[i];
        for (let j = 1; j < arrayAuxiliar.length; j++) {
            if (auxiliar != arrayCombinacao[j]) {
                arrayCombinacao.push(auxiliar);
                // push >> adicionar no vetor
            }
            auxiliar = auxiliar + arrayAuxiliar[j];
        }
        arrayAuxiliar.shift(); // Retirar a primeira palavra
        arrayCombinacao.push(auxiliar);
        i--;
    }

    document.write('Palavra :' + word + 'Combinações: ' + arrayCombinacao);
});
