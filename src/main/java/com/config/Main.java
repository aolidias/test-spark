package com.config;

import com.controller.TesteController;
import spark.Spark;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");

        Spark.get("/test", TesteController:: test);
    }
}
