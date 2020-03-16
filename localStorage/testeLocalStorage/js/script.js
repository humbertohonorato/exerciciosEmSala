

let salvarTeste = () => {
      
    localStorage.setItem('teste', document.getElementById('teste').value);
}

document.onchange = salvarTeste;