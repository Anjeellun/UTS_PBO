/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.untirta.A_3337210040_AnjeliGusnawan;

/**
 *
 * @author Anjeli Gusnawan
 */

    public class Bike extends Vehicle {
    private final int price;
    private final String modelcode;
    private final String frame;
    private final String brakes;
    private final int wheelsize;
    private final int tyresize;
    private final String handlebar;
    

    public Bike(String name, int price, String modelcode, String frame, 
            String brakes, int wheelsize, int tyresize, 
            String handlebar){
        
    super(name);
    this.price = price;
    this.modelcode = modelcode;
    this.frame = frame;
    this.brakes = brakes;
    this.wheelsize = wheelsize;
    this.tyresize = tyresize;
    this.handlebar = handlebar;
    
    }
    
    //Method Price

    public int getPrice() {
        return price;
    }

    public int setPrice(int price) {
        return price;
    }
    
    //Method Model Code

    public String getModelCode() {
        return modelcode;
    }

    public String setModelCode(String modelcode) {
        return modelcode;
    }
    
    //Method Frame
    
    public String getFrame() {
        return frame;
    }

    public String setFrame(String frame) {
        return frame;
    }
    
    //Method Brakes
    
    public String getBrakes() {
        return brakes;
    }

    public String setBrakes(String brakes) {
        return brakes;
    }
    
    //Method Wheel Size
    
    public int getWheelSize() {
        return wheelsize;
    }

    public int setWheelSize(int wheelsize) {
        return wheelsize;
    }
    
    //Method Tyre Size
    
    public int getTyreSize() {
        return tyresize;
    }

    public int setTyreSize(int tyresize) {
        return tyresize;
    }
    
    //Method Handlebar
    
    public String getHandlebar() {
        return handlebar;
    }

    public String setHandleBar(String handlerbar) {
        return handlebar;
    }
}