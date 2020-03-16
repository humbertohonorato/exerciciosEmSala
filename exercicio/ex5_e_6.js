document.getElementById('btnConversorCelsius').addEventListener('click', () => {
    let valorDigitado = document.querySelector('#fahrenheit').value;
    let celsius = (valorDigitado - 32) * 5 / 9    //(32 °F − 32) × 5/9 = 0 °C
    document.write('Valor em fahrenheit  ' + valorDigitado + ' ºF, convertido para celsius  ' + Math.round(celsius) + 'ºC');
});

document.getElementById('btnConversorFahrenheit').addEventListener('click', () => {
    let valorDigitado = document.querySelector('#celsius').value;
    let fahrenheit = (valorDigitado * 9 / 5) + 32     //(0 °C × 9/5) + 32 = 32 °F
    document.write('Valor em Celcius  ' + valorDigitado + 'ºC, convertido para Fahrenheit  ' + Math.round(fahrenheit) + 'ºF');
});