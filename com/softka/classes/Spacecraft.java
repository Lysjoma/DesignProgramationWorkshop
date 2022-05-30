/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softka.classes;

/**
 *
 * @author Johan Sebastian Cuellar Orjuela
 */
//An abstract class is created, This is call spacecraft which means an spaceship, this class at the sametime implements the interface that was created before called Shuttle Vehicle
public abstract class Spacecraft implements ShuttleVehicle{
    
    //The constructor is created
    public Spacecraft(){}
    
    //Some methods are created
    public void takeOff(){
        System.out.println("The spacecraft Took off");
    }
    
    //The methods of the interface were override with new actions
    @Override
    public void release() {
        System.out.println("The spacecraft was unfolded");
    }

    @Override
    public void carry() {
        System.out.println("The spacecraft is being carrying");
    }

    @Override
    public void exploted() {
        System.out.println("Oh No!!! The spacecraft exploted!!!");
    } 
}
