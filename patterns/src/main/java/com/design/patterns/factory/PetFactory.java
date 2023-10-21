package com.design.patterns.factory;
import org.springframework.stereotype.Component;

@Component
public class PetFactory {
    public Pet factoyMethod(String petType){
        petType = petType.toLowerCase();

        switch (petType)
        {
            case  "cat":
                return  new Cat();
            case "dog":
                return new Dog();
            case "horse":
                return  new Horse();
            default:
                throw new IllegalArgumentException("Unknown Pet Specified");
        }
    }

}
