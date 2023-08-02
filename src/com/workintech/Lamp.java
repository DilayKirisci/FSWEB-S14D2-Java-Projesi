package com.workintech;

public class Lamp {
    private boolean battery;
    private LampType type;
    private int globalRating;

    public Lamp(boolean battery, LampType type, int globalRating){
        this.battery = battery;
        this.globalRating = globalRating;
        this.type = type;
    }

    public void turnOn(){
        System.out.println("LAmp is on");
    }

    public LampType getStyle(){
        return type;
    }
    public boolean isBattery(){
        return battery;
    }
    public int getGlobalRating() {
        return globalRating;
    }

}
