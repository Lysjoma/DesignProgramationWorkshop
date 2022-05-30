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
//A class for Unmanned Spaceships types is created, this class also inherits from the super class call spacecraft.
public class UnmannedSpaceship extends Spacecraft{
    
    //The constructors of the class is created
    private String name;
    public UnmannedSpaceship(){
        super();
    }  
    
    //In this constructor we can see the use of the overload action.
    public UnmannedSpaceship(String name) {
        this.name = name;
    }
    
    // the set and get method are created
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }    
    
    //A toString method is created to see the information of the spaceship
    @Override
    public String toString() {
        return "UnmannedSpaceship{" + "name=" + name + '}';
    }
    
    
}
