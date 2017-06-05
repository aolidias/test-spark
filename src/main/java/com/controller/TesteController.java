package com.controller;

import spark.Request;
import spark.Response;

/**
 * Created by adias on 05/06/17.
 */
public class TesteController {

    public static Object test(Request request, Response response) {
        return "Test ok";
    }
}
