package com.design.patterns.adapter;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


public class AppleAdapterTest {


    @Test
    public void  testAdapter(){

        Orange orange = new MoroOrange();
        Apple apple = new AppleAdapter(orange);
        System.out.println(apple.getVariety());
        apple.eat();


    }



}
