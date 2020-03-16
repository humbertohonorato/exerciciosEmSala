document.getElementById('btnConversor').addEventListener('click', () => {
    let cm = parseFloat(document.getElementById('centimetros').value);
    let polegada = cm * 0.393701;
    document.write('Valor em centimetros convertido para polegadas: ' + polegada);
})