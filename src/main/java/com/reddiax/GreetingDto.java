package com.reddiax;

public class GreetingDto {

    private String hello;

    // Default constructor is needed by JSON-B
    public GreetingDto() {
    }

    public GreetingDto(String hello) {
        this.hello = hello;
    }

    // Standard getters and setters are important for JSON-B
    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
