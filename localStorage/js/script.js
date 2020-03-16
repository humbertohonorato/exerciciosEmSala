// Condição para vetificar se valor dos campos não é null
if (localStorage.estado && localStorage.dataInicio && localStorage.dataFinal){
    document.getElementById('estado').value = localStorage.estado;
    document.getElementById('dataInicio').value = localStorage.dataInicio;
    document.getElementById('dataFinal').value = localStorage.dataFinal;
}
// Função para salvar data (arrow Function)
let salvarData = () =>{  
    // Variáveis armazenando o valor dos inputs e do select
    localStorage.setItem('estado', document.querySelector('#estado').value);
    localStorage.setItem('dataInicio', document.querySelector('#dataInicio').value);
    localStorage.setItem('dataFinal', document.querySelector('#dataFinal').value);
}
// Salvar/atualizar as informações do documento automaticamente  (onchange)
document.onchange = salvarData;

/* Para Salvar ou Excluir no click

document.querySelector('#add').addEventListener('click', ()=>{

    localStorage.setItem('estado', document.querySelector('#estado').value);
    localStorage.setItem('dataInicio', document.querySelector('#dataInicio').value);
    localStorage.setItem('dataFinal', document.querySelector('#dataFinal').value);

});

document.querySelector('#delete').addEventListener('click', () =>{
    localStorage.removeItem('estado');
    localStorage.removeItem('dataInicio');
    localStorage.removeItem('dataFinal');
});

*/
  
