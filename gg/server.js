const express = require('express');

const app = express();

app.get('/', (req, res) => {
    res.send('Helllow Word');
});
app.get('/contato', (req, res) => {
    res.send('Bem vindo a página de contato');
});

app.listen(3000);