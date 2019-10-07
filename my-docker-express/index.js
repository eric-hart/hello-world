const express = require('express');
const app = express();

app.get('/greeting', (req, res) => {
  res.send(JSON.stringify({ 'content': 'Hello, World!' }));
});

app.listen(3000);

console.log('[START]: http://localhost:3000');
