/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.untirta.A_3337210040_AnjeliGusnawan;

/**
 *
 * @author Anjeli Gusnawan
 */
public class RunningTest {
    
    public static void main(String[] args) {    
    
    Car car = new Car ("Honda Civic RS", 602500000, 
                "1.5 VTEC Turbo Petrol Engine, 4 Cylinder 16 Valve DOHC", 
                " 176 hp", "Electric Power", "47 Litres", 
                "6 Seats", "17 Inch & 215/50 R17");
    
    Bike bike = new Bike ("Cannondale SystemSix Carbon Ultegra", 90000000, 
            "C11401M", "SystemSix Carbon, integrated cable routing w/ Switchplate, SAVE, PF30a flat mount disc, 12×142 Speed Release thru-axle", 
            "Shimano Ultegra hydraulic disc, 160/140mm RT800 rotors", 700, 25, "HollowGram KNØT SystemBar, Carbon, 8 deg.pitch adjust");
   
     System.out.println("//====================================================================//");
     System.out.println("\t ULANGAN TENGAH SEMESTER PEMROGRAMAN BERORIENTASI OBJEK");
     System.out.println("//====================================================================//");
     System.out.println("NAMA = ANJELI GUSNAWAN");
     System.out.println("NIM = 3337210040");
     System.out.println("KELAS = A");
     System.out.println("========================================================================");
     
     System.out.println("\n");
   
   
    //Car
    
    System.out.println("//=======================================//");
    System.out.println("\t CAR SPECIFICATION & PRICE");
    System.out.println("//=======================================//");
    
    System.out.println("- Model Name: " +car.getModelName());
    System.out.println("- Price: " +car.getPrice());
    System.out.println("- Engine: " +car.getEngine());
    System.out.println("- Power: " +car.getPower());
    System.out.println("- Steering: " +car.getSteering());
    System.out.println("- Fuel Tank: " +car.getFuelTank());
    System.out.println("- Seating: " +car.getSeating());
    System.out.println("- Wheel & Tyre: " +car.getWheelTyre());
    
    System.out.println("\n");
    
    //Bike
    
    System.out.println("//=======================================//");
    System.out.println("\t BIKE SPECIFICATION & PRICE");
    System.out.println("//=======================================//");
    
    System.out.println("- Model Name: " +bike.getModelName());
    System.out.println("- Price: " +bike.getPrice());
    System.out.println("- Model Code: " +bike.getModelCode());
    System.out.println("- Frame: " +bike.getFrame());
    System.out.println("- Brakes: " +bike.getBrakes());
    System.out.println("- Wheel Size: " +bike.getWheelSize());
    System.out.println("- Tyre Size: " +bike.getTyreSize());
    System.out.println("- Handlebar: " +bike.getHandlebar());

    }
}