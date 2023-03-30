package com.imcbb.mapstruct.mappers;

import com.imcbb.mapstruct.domain.Car;
import com.imcbb.mapstruct.domain.CarDTO;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.core.convert.converter.Converter;

/**
 * @author kevin.chen
 * Date 2023/3/29
 * Time 10:13
 */
@Mapper(componentModel = "spring",uses = WheelMapper.class)
public interface CarMapper extends Converter<Car, CarDTO> {
    @Override
    @Mappings(
           @Mapping(source = "wheels",target = "carWheels")
    )
    CarDTO convert(Car source);
}
