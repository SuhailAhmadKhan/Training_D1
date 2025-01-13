const http = require('http');
const port = process.env.PORT || 1337;

const server = http.createServer(function (request, response) {
  response.writeHead(200, { "Content-Type": "text/html" });
  response.end("Hello, World!");
});

server.listen(port, () => {
  console.log(`Server running at http://localhost:${port}/`);
});
