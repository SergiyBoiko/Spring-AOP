package com.ghub.boiko;

import com.ghub.boiko.carparts.Engine;
import com.ghub.boiko.carparts.Wheel;

public class Car {

    private Engine engine;
    private Wheel wheel;
    private boolean doorOpen = false;
    private boolean carMoves = false;

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void startCarMove(){
        carMoves = true;
        engine.setPowerOn(true);
        System.out.println("You car moves");
    }

    public void stopCarMoves(){
        carMoves = false;
        engine.setPowerOn(false);
        System.out.println("You car spoted");
    }

    public boolean isDoorOpen(){
        System.out.println("Door open, you can't move, close door");
        if(carMoves){
            doorOpen = false;
        }else{
            doorOpen = true;
        }
     return doorOpen;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheel=" + wheel +
                ", doorOpen=" + doorOpen +
                ", carMoves=" + carMoves +
                '}';
    }
}
