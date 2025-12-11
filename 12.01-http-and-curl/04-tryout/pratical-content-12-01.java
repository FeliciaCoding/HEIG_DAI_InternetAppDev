package ch.heigvd;

import io.javalin.Javalin;

public class Main {
    // http://localhost:8080
    public static final int PORT = 8080;

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        app.get("/", ctx -> ctx.result("Hello, world!"));
        app.get("/", ctx -> ctx.result("GET request - get a resource"));
        app.get("/", ctx -> ctx.result("POST request - create a resource"));
        app.get("/", ctx -> ctx.result("PATCH request - Partially update a resource"));
        app.get("/", ctx -> ctx.result("PUT request - Update / Create a resource, meaing makig multiple dentical requestes"));
        app.get("/", ctx -> ctx.result("DELETE request"));

        app.start(PORT);

    }
}