package com.design.patterns.factory;

public class Horse implements Pet{
    private  String name;
    private boolean hungry = true;
    @Override
    public void setName(String name) {
        this.name= name;
    }

    @Override
    public void feed() {
        hungry = false;

    }


    public String getName() {
        return name;
    }


    public boolean getFeed() {
        return hungry;
    }
}
