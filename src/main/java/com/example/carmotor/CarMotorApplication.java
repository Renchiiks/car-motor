package com.example.carmotor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CarMotorApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(CarMotorApplication.class, args);

        Car car = context.getBean(Car.class);
        car.methodFromMotor();
    }

}
