package com.chris.maven.quickstart;

import com.google.gson.Gson;

public class App
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        System.out.println(gson.toJson("Hello World!") );
    	System.out.println("Hello World!");
    }
}


