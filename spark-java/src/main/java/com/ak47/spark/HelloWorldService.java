package com.ak47.spark;

import static spark.Spark.*;

public class HelloWorldService {

    public static void main(String[] args) {

        get("hello", (req, res) -> "Hello, ak47");

        get("hello/:name", (req, res) -> {
            return "Hello: " + req.params(":name");
        });

    }

}
