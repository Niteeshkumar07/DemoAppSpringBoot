package com.telusko.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.net.SocketOption;

@Component
//COmponent givea bean so we spring can craete object of it
public class Dev {

    @Autowired //field injection
    @Qualifier("laptop") // as if we not want to use primary so we use it with class name with small letter
    private Computer comp;
//    private Laptop laptop;
    // as wspring create a object of dev and laptop but they are not interconnected
    // as to make interrconnect we use applicationcontext again here for laptop but we not use
    // we use autowired here which initially as spring want object of dev but dev is dependent on laptop so it interconnect each other

//    public Dev(Laptop laptop){ // constructor injection other way to do it
//        this.laptop = laptop;
//    }
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }


    public void build(){

//        laptop.compile();
        comp.compile();
        System.out.println("Working on awesome project");
    }
}
