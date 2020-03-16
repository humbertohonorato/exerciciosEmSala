document.getElementById('btnOk').addEventListener('click', () => {

    let word = document.getElementById('word').value;
    let quebra = word.split(' ');
    let up = [];

    for (let i = 0; i < quebra.length; i++){
       up[i]=(quebra[i].charAt(0).toUpperCase()+quebra[i].slice(1));
    }
    up = up.join(' ');
    document.write(up);
    
    
    
})
