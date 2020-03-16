document.getElementById('btnOk').addEventListener('click', () => {
    
    let palavra = document.getElementById('word').value;
    let inverter = palavra.split('').reverse().join('');

    if (palavra === inverter){
        document.write(palavra + ' invertido fica ' + inverter + ' então é um palindrome!');
    }
    else {
        document.write(palavra + ' invertido fica ' + inverter + ' então não é um palindrome!');
    }
});