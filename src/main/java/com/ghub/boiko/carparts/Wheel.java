package com.ghub.boiko.carparts;

public class Wheel {

    private Tyres tyres;

    public Wheel(Tyres tyres) {
        this.tyres = tyres;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "tyres=" + tyres +
                '}';
    }
}
