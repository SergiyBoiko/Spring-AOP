package com.ghub.boiko.aspects;

import com.ghub.boiko.Car;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    @After("execution(* com.ghub.boiko.Car.startCarMove())")
    public void logAfterStartCarMove(JoinPoint joinPoint)throws Throwable{
        System.out.println("Aspect after start car moves");
    }

    @Before("execution(* com.ghub.boiko.Car.stopCarMoves())")
    public void logBeforeStopCarMoves() throws Throwable{
        System.out.println("Aspect before stop car moves");
    }

    @Around("execution(* com.ghub.boiko.Car.isDoorOpen())")
    public void logAroundIsDoorOpen(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Car car = (Car) proceedingJoinPoint.getTarget();
        if (car.isDoorOpen()||car.getEngine().isPowerOn()){
            System.out.println("Aspect you not close door or switch off power");
        }else {
            try {
                proceedingJoinPoint.proceed();
                System.out.println("Aspect door close");
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
    @After("execution(* com.ghub.boiko.carparts.Engine.setPowerOn(boolean))")
    public void logAfterSetPowerOn(JoinPoint joinPoint) throws Throwable{
        Object[] args = joinPoint.getArgs();
        for (Object argument : args){
            try {
                if ((Boolean) argument) {
                    System.out.println("Aspect power on, you car can move");
                } else {
                    System.out.println("Aspect power off, you need on power or close door");
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
