package com.design.patterns.controller;
import com.design.patterns.builder.ContactBuilder;
import com.design.patterns.builder.Contacts;
import com.design.patterns.factory.Pet;
import com.design.patterns.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class AppControler {


    //Factory Pattern
    @Autowired
    PetFactory petFactoryObject;

    @PostMapping("adopt/{type}/{name}")
    public  Pet adoptPet(@PathVariable String type, @PathVariable String name){
        Pet newAdoptedPed = this.petFactoryObject.factoyMethod(type);
        newAdoptedPed.setName(name);
        newAdoptedPed.feed();
        return newAdoptedPed;
    }

    //Builder Pattern
    @GetMapping("getContacts")
    public List<Contacts> getContacts(){

        //using No Args Constructor,
        //many lines of code
        //thread safety is difficult
        //object may go in inconsistent state
        //what if its a list that goes on and there are many many contacts
        // though this pattern saves from memorizing null values etc and also the order of params
        List<Contacts> contactsList = new ArrayList<>();
        Contacts person1 = new Contacts();
        person1.setEmail("abc@gmail.com");
        person1.setFirstName("ABC");
        person1.setLastName("CDE");
        contactsList.add(person1);

        //Using all Args Constructor
        //Need to remember the order of params , null values etc
        Contacts person2 = new Contacts("XYZ", "YUX", "zzz@z.com");
        contactsList.add(person2);
        Contacts person3 = new Contacts(null, "YUX", null);
        contactsList.add(person3);
        //using Builder (a relief in extra code, copy paste bugs , inconsistent state)

        Contacts person4 = new ContactBuilder().
                setEmail("builder@oject.com").
                setLastName(null).setFirstName("buildername").
                buildContactList();

        contactsList.add(person4);

        return contactsList;

    }



}
