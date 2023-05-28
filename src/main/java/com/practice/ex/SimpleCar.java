package com.practice.ex;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SimpleCar {
    private CarDriver carDriver;
    private int velocity;

    public SimpleCar() {
    }

    public SimpleCar(CarDriver carDriver, int velocity) {
        this.carDriver = carDriver;
        this.velocity = velocity;
    }
    public void accelerate(){
        this.velocity += 10;
    }

    public void brake(){
        this.velocity -= 10;
    }
}
