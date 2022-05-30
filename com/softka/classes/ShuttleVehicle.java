/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softka.classes;

/**
 *
 @author Johan Sebastian Cuellar Orjuela
 */
//The interface is created, this has the goal to have a way to carry an spaceship to the space.
public interface ShuttleVehicle {
    //A method to release the spaceship is created.
    public void release();
    //A method to carry an spaceship is created.
    public void carry();
    //A method to know if the spaceship exploted is created.
    public void exploted();
}
