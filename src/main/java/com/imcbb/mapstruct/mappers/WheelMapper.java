package com.imcbb.mapstruct.mappers;

import com.imcbb.mapstruct.domain.Wheel;
import com.imcbb.mapstruct.domain.WheelDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

/**
 * @author kevin.chen
 * Date 2023/3/30
 * Time 11:41
 */
@Mapper(componentModel = "spring")
public interface WheelMapper extends Converter<Wheel, WheelDTO> {

    /**
     * Convert the source object of type {@code S} to target type {@code T}.
     *
     * @param source the source object to convert, which must be an instance of {@code S} (never {@code null})
     * @return the converted object, which must be an instance of {@code T} (potentially {@code null})
     * @throws IllegalArgumentException if the source cannot be converted to the desired target type
     */
    @Override
    @Mappings(
            @Mapping(source = "size",target = "wheelSize")
    )
    WheelDTO convert(Wheel source);
}
