require('@babel/register');

const https = require('https');

const http = require('http');

const { default: app } = require('./app.js');

http.createServer(app.callback()).listen(3000);

https.createServer(app.callback()).listen(3001);
