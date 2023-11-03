package com.design.patterns.singleton;


//A traditional singleton
public class SingA {
    private static SingA instance;
    public SingA() {
        super();
    }

    public  static  SingA getInstance(){

        if(instance == null){
            synchronized (SingA.class){
                if(instance == null) {
                    instance = new SingA();
                }
            }
        }



        return instance;
    }
}
