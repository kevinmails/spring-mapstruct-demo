package com.imcbb.mapstruct;

import com.imcbb.mapstruct.domain.Car;
import com.imcbb.mapstruct.domain.CarDTO;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Order(0)
@Slf4j
@Component
public class ApplicationStartupRunner implements CommandLineRunner {

    final
    ConversionService conversionService;

    public ApplicationStartupRunner(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public void run(String... args) {

        Car  car = Car.builder().color("red").weight(12).build();
        val carDTO = conversionService.convert(car, CarDTO.class);

        log.info("carDta:" + carDTO.getColor());



        log.info("系统启动");


    }
}
