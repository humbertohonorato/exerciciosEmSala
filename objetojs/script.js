function MyCar(cor, velocidadeMaxima, ) {
    this.Cor = cor;
    this.VelocidadeMaxima = velocidadeMaxima;
    this.VelocidadeAtual = 0;
}

MyCar.prototype.Acelerar = function () {
    this.VelocidadeAtual++;
}

MyCar.prototype.Frear = function () {
    if (this.VelocidadeAtual > 0) {
        this.VelocidadeAtual--;
    }
}

let meuCarro = new MyCar('Preto', 10);
let meuFusca = new MyCar('Vermelho', 5);

let minhaFerrari = {
    Cor: 'Amarela',
    VelocidadeMaxima: 300,
    VelocidadeAtual: 0,

    Acelerar: function () {
        if (this.VelocidadeAtual < this.VelocidadeMaxima) {
            this.VelocidadeAtual++;
        }
    }
};

document.write(meuCarro.Cor);
document.write(meuCarro.VelocidadeMaxima);

document.getElementById('acelerar').addEventListener('click', () => {
    meuCarro.Acelerar();
    document.write('meuCarro: ' + meuCarro.VelocidadeAtual);

    meuFusca.Acelerar();
    document.write('meuFusca: ' + meuCarro.VelocidadeAtual);

    minhaFerrari.Acelerar();
    document.write('minhaFerrari: ' + minhaFerrari.VelocidadeAtual);
});

document.getElementById('frear').addEventListener('click', () => {
    meuCarro.Frear();
    document.write('meuCarro: ' + meuCarro.VelocidadeAtual);

    meuFusca.Frear();
    document.write('meuFusca: ' + meuFusca.VelocidadeAtual);
});