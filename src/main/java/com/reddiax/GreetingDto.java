package com.reddiax;

public class GreetingDto {

    private String name;

    public GreetingDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
