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
//The class MannedSpaceships is created
public class MannedSpaceships extends Spacecraft{ //This class inherits from the abstract class Spacecraft
    private String name; //The variable name is created
    //The constructors are created.
    public MannedSpaceships() {
        super();
    }
    
    //here we can see we use an overload in the constructor method
    public MannedSpaceships(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    //The set and get method are created.
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }    
    
    //The toString method is created to see the data in the class when an object is instantiated.
    @Override
    public String toString() {
        return "MannedSpaceships{" + "name=" + name + '}';
    }
    
    
    
}
