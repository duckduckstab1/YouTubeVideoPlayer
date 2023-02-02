import http.server

import socketserver

PORT = 80

Handler = http.server.SimpleHTTPRequestHandler

with socketserver.TCPServer(("", PORT), Handler) as httpd:

    print("serving at port", PORT)

    httpd.serve_forever()

# Starting main.java

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Start the webserver

        new Server().start();

    }

}
