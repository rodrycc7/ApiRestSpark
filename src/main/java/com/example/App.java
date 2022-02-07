package com.example;

import static spark.Spark.get;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        get("/helloworld", (req, res) -> "Hello World");
    }
}
