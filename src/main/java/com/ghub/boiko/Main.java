package com.ghub.boiko;

import com.ghub.boiko.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = (Car) context.getBean("car");
        car.startCarMove();
        car.stopCarMoves();
        car.isDoorOpen();
    }
}
