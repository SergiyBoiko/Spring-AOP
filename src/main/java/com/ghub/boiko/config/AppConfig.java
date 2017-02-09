package com.ghub.boiko.config;

import com.ghub.boiko.Car;
import com.ghub.boiko.aspects.LogAspect;
import com.ghub.boiko.carparts.Engine;
import com.ghub.boiko.carparts.Tyres;
import com.ghub.boiko.carparts.Wheel;
import com.ghub.boiko.carparts.typetyres.SummerTyres;
import com.ghub.boiko.carparts.typetyres.WinterTyres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.math.BigDecimal;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.ghub.boiko.*"})
@Configuration
public class AppConfig {

    @Bean
    public Engine engine(){
        return new Engine(BigDecimal.valueOf(2.4));
    }

    @Bean
    public Tyres tyres(){
        return new Tyres("12.5","Super Swamper Bogger");
    }

    @Bean
    public SummerTyres summerTyres(){
        return new SummerTyres("R20","Bridgestone Potenza");
    }

    @Bean
    public WinterTyres winterTyres(){
        return new WinterTyres("R20","Michelin X-ICE North");
    }

    @Bean
    public Wheel wheel(){
        return new Wheel(tyres());
    }

    @Bean
    public Car car(){
        return new Car(engine(),wheel());
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
