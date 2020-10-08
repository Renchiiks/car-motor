package com.example.carmotor;

import org.springframework.stereotype.Component;

@Component
public class Motor {
    private Long id;
    private String name;
    private String model;

    public Motor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void methodFromMotor() {
        System.out.println("brum");
    }
}
