package com.imcbb.mapstruct;

import com.imcbb.mapstruct.domain.Car;
import com.imcbb.mapstruct.domain.CarDTO;
import com.imcbb.mapstruct.domain.Wheel;
import com.imcbb.mapstruct.mappers.CarMapper;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.convert.ConversionService;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
class SpringMapstructDemoApplicationTests {

	@Autowired
	ConversionService conversionService;

	@Test
	void contextLoads() {

	}

	@Test
	void testConverter(){


		List wheels = Lists.list(Wheel.builder().size(10).build(), Wheel.builder().size(20).build());
		Car car = Car.builder().color("red").weight(12).wheels(wheels).build();
		val carDto = conversionService.convert(car, CarDTO.class);
		log.info(carDto.getColor());
		log.info(carDto.getCarWheels().toString());
	}
}
