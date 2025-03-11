package com.telusko.DemoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
// now spring know to create a object for laptop also and it crate for dev already we use @component to signify it for which class to object should create
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compiling with 404 Bugs");
    }
}
