document.getElementById('btnOk').addEventListener('click', () => {
    
    let word = document.getElementById('word').value;
    let quebra = word.split(' ');
    let array = "";

    for (let i = 0; i < quebra.length; i++){
        if (quebra[i] >= array){
            array = quebra[i];
        }
        
    }
    document.write(array);
    
});
