package com.practice.ex;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarDriver {
    private String name;
    private int license;
    public CarDriver(){
    }

    public CarDriver(String name, int license) {
        this.name = name;
        this.license = license;
    }
}
