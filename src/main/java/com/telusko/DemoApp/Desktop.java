package com.telusko.DemoApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    //As we saw that in dev class it takes computer as it types so
    // two other class dependent on it what it choose laptop or desktop as to solve we remove @Component
    // form which we not required or for both we use but make a preferenecr we use @primary
    public void compile(){
        System.out.println("Compiling with 404 bugs but faster");
    }
}
