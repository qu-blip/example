package com.qucan.test;

import org.springframework.stereotype.Component;

@Component
public class ComputerImp implements Computer {
    @Override
    public void add() {
        System.out.println("oh year");
    }
}
