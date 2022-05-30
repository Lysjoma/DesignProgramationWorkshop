/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designprogramationworkshop;

//The respective imports have been included
import com.softka.classes.MannedSpaceships;
import com.softka.classes.UnmannedSpaceship;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Johan Sebastian Cuellar Orjuela
 */
//The main class is created
public class DesignProgramationWorkshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //The object scanner is instantiated
        Scanner sc = new Scanner(System.in);
        //Two arrey list are created to save every spaceship we decide to create
        ArrayList<UnmannedSpaceship> ua = new ArrayList<>();
        ArrayList<MannedSpaceships> ma = new ArrayList<>();
        //The string newname is created to set a name to the new spaceship we create.
        String newName;
        
        //An object is instantiated for unnmaned spaceships.
        UnmannedSpaceship u = new UnmannedSpaceship();
        //A name for his object is set.
        u.setName("Pionero X");
        String result4 = u.getName();
        //The print helps us to see the new name, with the respective methods
        System.out.println("The name of the spaceship is: "+result4);
        u.takeOff();
        u.carry();
        u.release();
        System.out.println("---------------------------------------------");
        //An obect is instantiated
        MannedSpaceships m = new MannedSpaceships();
        //A name for his object is set.
        m.setName("Salyut");
        String result = m.getName();
        //The print helps us to see the new name, with the respective methods
        System.out.println("The name of the spaceship is: "+result);
        System.out.println("---------------------------------------------");
        MannedSpaceships m2 = new MannedSpaceships();
        //A name for his object is set.
        m2.setName("Vostok");
        String result2 = m2.getName();
        //The print helps us to see the new name, with the respective methods
        System.out.println("The name of the spaceship is: "+result2);
        //We call the respective methos for this object
        m2.takeOff();
        m2.carry();
        System.out.println("---------------------------------------------");
        UnmannedSpaceship u2 = new UnmannedSpaceship();
        //A name for his object is set.
        u2.setName("Cassini-Huygens");
        String result3 = u2.getName();
        //The print helps us to see the new name, with the respective methods
        System.out.println("The name of the spaceship is: "+result3);
         //We call the respective methods for this object
        u2.carry();
        u2.release();
        u2.exploted();
        System.out.println("---------------------------------------------");
        //We ask if we wan create a new spaceship, and algo save the answer in the createShip variable, it has to be yes, or no.        
        System.out.println("Do you want to create a new spaceship?");
        String createShip = sc.nextLine();
        //We validate if the answer is yes or no to continue to the cicle, in this case, it is a while cicle.
        while(createShip.equals("yes")){
            //We ask which kind of spaceship we want to create, 1 for Unmanned Spaceship or 2 for Manned Spaceship, we save the asnwer in the typeOfShip variable.
            System.out.println("What kind of spaceship do you want to create?   \n 1 for Unmanned Spaceship, or 2 for Manned Spaceship");
            int typeOfShip = sc.nextInt();
            //We validate if the answer is 1 or 2.
            if (typeOfShip == 1) {
                //We ask the name for the new spaceship, and also we crate the spaceship with the respective type.
                System.out.println("Type the spaceship name");
                newName = sc.next();
                //We add the new spaceship to the arraylist of its type.
                ua.add(new UnmannedSpaceship(newName));
                System.out.println("A new spaceship has been created, and its name is: "+newName);
            }else{
                //We do the same process than the true part of the if, but for the Manned Spaceship type.
                System.out.println("Type the spaceship name");
                newName = sc.next();
                ma.add(new MannedSpaceships(newName));
                System.out.println("A new spaceship has been created, and its name is"+newName);
            }
            //We validate if we want to create another spaceship and it returns to the start of the while cicle
            System.out.println("Do you want to create a new spaceship?");
            createShip = sc.next();
            //We validate if the answer is yes, or no
            if (createShip.equals("yes")) {
            //If the condition is true, nothing happen and the while cicle starts again.    
            }else{
                //If the condition is false, the while cicle finish
                break;
            }
        }
        //We ask if we want to see all our new spaceships we have created, and save the answer in the seeAll variable.
        System.out.println("Do you want to see the new spaceShips you have created?");
        String seeAll = sc.next();
        //We validate if the answer is yes, or no.
        if (seeAll.equals("yes")) {
            //If the answer is true, we run a for cicle, and show every spaceship we have created.
            for (MannedSpaceships ms : ma) {
                System.out.println(ms);
            }
            for (UnmannedSpaceship us : ua) {
                System.out.println(us);
            }
        }
        
    }
    
}
