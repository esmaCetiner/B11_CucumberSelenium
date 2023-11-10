package com.eurotech.stepDefinitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
       // System.out.println("\tThis is coming from Before method");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
    @After
    public void tearDown(){
       // System.out.println("\tThis is coming from After method");
        Driver.closeDriver();
    }
    @Before("@db")
    public void setUpDB(){
       // System.out.println("\tConnecting DB");
    }
    @After("@db")
    public void tearDownDB(){
        //System.out.println("\tDisconnecting DB");
    }

}
