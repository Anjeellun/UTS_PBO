/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.untirta.A_3337210040_AnjeliGusnawan;

/**
 *
 * @author Anjeli Gusnawan
 */

    public class Car extends Vehicle {
    private final int price;
    private final String engine;
    private final String power;
    private final String steering;
    private final String fueltank;
    private final String seating;
    private final String wheeltyre;
    

    public Car(String name, int price, String engine, String power, 
            String steering, String fueltank, String seating, String wheeltyre){
        
    super(name);
    this.price = price;
    this.engine = engine;
    this.power = power;
    this.steering = steering;
    this.fueltank = fueltank;
    this.seating = seating;
    this.wheeltyre = wheeltyre;
    
    }
    
    //Method Price

    public int getPrice() {
        return price;
    }

    public int setPrice(int price) {
        return price;
    }
    
    //Method Engine

    public String getEngine() {
        return engine;
    }

    public String setEngine(String engine) {
        return engine;
    }
    
    //Method Power
    
    public String getPower() {
        return power;
    }

    public String setPower(String power) {
        return power;
    }
    
    //Method Steering
    
    public String getSteering() {
        return steering;
    }

    public String setSteering(String steering) {
        return steering;
    }
    
    //Method FuelTank
    
    public String getFuelTank() {
        return fueltank;
    }

    public String setFuelTank(String fueltank) {
        return fueltank;
    }
    
    //Method Seating
    
    public String getSeating() {
        return seating;
    }

    public String setSeating(String seating) {
        return seating;
    }
    
    //Method WheelTyre
    
    public String getWheelTyre() {
        return wheeltyre;
    }

    public String setWheelTyre(String wheeltyre) {
        return wheeltyre;
    }
}
    