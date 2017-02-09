package com.ghub.boiko.carparts;

import java.math.BigDecimal;

public class Engine {

    private BigDecimal engineCapacity;
    private boolean powerOn = false;

    public Engine(BigDecimal engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public BigDecimal getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(BigDecimal engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public boolean isPowerOn(){
        return powerOn;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineCapacity=" + engineCapacity +
                ", powerOn=" + powerOn +
                '}';
    }
}
