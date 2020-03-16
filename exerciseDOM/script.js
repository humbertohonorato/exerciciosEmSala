// atividade 1
document.getElementById('btnStyle').addEventListener('click', () =>{
   let text = document.getElementById('text').style.color = '#ff0f0f';
   let font = document.getElementById('text').style.fontSize = '50px';
   
})

// atividade 2
document.getElementById('submit').addEventListener('click', ()=>{
    let nome = document.getElementById('x').value;
    let sobreNome = document.getElementById("a").value;
    
    document.write(nome + ' ' + sobreNome);
})

// atividade 3
document.getElementById('textCor').style.color = '#31ff4e';

// atividade 4
document.getElementById('btnEnviar').addEventListener('click', () =>{
   let href =  document.getElementById('w3r');
   let hreflag =  document.getElementById('w3r').hreflang;
   let rel =  document.getElementById('w3r').rel;
   let target =  document.getElementById('w3r').target;
   let type =  document.getElementById('w3r').type;

   document.write('href: '+ href + '<br>'+'hreflag: ' + hreflag + '<br>'+'rel: ' + rel + '<br>'+'target:' + target + '<br>'+'type:' + type);
})

// atividade 5
