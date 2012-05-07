package com.acme.testcuke;

import org.springframework.stereotype.Component;

/**
 * petrovic, 5/6/12, 8:26 PM
 */
@Component
public class Belly {
    private int cukes;

    public void setCukes(int cukes) {
        this.cukes = cukes;
    }

    public int getCukes() {
        return cukes;
    }
}