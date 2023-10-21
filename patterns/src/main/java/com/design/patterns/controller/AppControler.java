package com.design.patterns.controller;
import com.design.patterns.factory.Pet;
import com.design.patterns.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AppControler {
    @Autowired
    PetFactory petFactoryObject;

    @PostMapping("adopt/{type}/{name}")
    public  Pet adoptPet(@PathVariable String type, @PathVariable String name){
        Pet newAdoptedPed = this.petFactoryObject.factoyMethod(type);
        newAdoptedPed.setName(name);
        newAdoptedPed.feed();
        return newAdoptedPed;
    }


}
