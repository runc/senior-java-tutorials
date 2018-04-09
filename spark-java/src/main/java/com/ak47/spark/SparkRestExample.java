package com.ak47.spark;


import com.google.gson.Gson;

import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.options;
import static spark.Spark.post;
import static spark.Spark.put;

/**
 * <p>
 *     具体更多用法可以参见spark,目前已经支持kotlin
 * </p>
 */
public class SparkRestExample {

    public static void main(String[] args) {

        final UserService userService = new UserServiceMapImpl();

        post("/users", (request, response) -> {

            response.type("application/json");

            User user = new Gson().fromJson(request.body(), User.class);

            userService.addUser(user);

            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS,""));

        });

    }

}
