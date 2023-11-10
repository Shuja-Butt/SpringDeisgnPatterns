package com.design.patterns.adapter;

public class MoroOrange implements  Orange{

    @Override
    public String getVariety() {
        return "enoying Moro";
    }

    @Override
    public void eat() {

        System.out.println("Moren eaten");
    }

    @Override
    public void peel() {
        System.out.println("Moren peeled");
    }

    @Override
    public void juice() {

        System.out.println("Moren juice");

    }
}
