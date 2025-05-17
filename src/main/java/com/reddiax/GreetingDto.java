package com.reddiax;

public class GreetingDto {

    private String hello;

    public GreetingDto(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
