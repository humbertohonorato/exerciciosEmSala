const express = require('express');
const routes = require('./routes');
const app = express();
const port = 3000;

app.use(routes);

// app.disable('x-powered-by'); // oculta a informação do framework nos headers



app.listen(port, () => {
    console.log(`API REST Rodando na Porta: ${port}`);
});