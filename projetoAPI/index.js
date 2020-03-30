const express = require('express');
const bodyParser = require('body-parser');
const fs = require('fs');
const app = express();

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

let rawbooks = fs.readFileSync('books.json'); // ler o arquivo books.json
let books = JSON.parse(rawbooks); // converter rawbooks para json

app.get('/', (req, res) => {
    res.send('Hellow World!');
});

app.get('/books', (req, res) => {
    res.json(books);
});

app.post('/books', (req, res) => {
    const book = req.body;
    if (Array.isArray(book)) {
        for (item of book) {
            books.push(item);
        }
    }
    else {
        books.push(book);
    }

    let jsonList = JSON.stringify(books);
    fs.writeFile('books.json', jsonList, 'utf8', () => { });
    res.send('Livro cadastrado com sucesso!');
});

app.get('/books/:isbn', (req, res) => {
    const isbn = req.params.isbn;
    for (let book of books) {
        if (book.isbn === isbn) {
            res.json(book);
            return;
        }
    }
    res.status(404).send('Livro não encontrado');
});

app.listen(3000);