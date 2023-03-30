package com.imcbb.mapstruct.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author kevin.chen
 * Date 2023/3/29
 * Time 10:15
 */
@Data
@Builder
public class CarDTO {

    private String color;
    private int weight;
    private List<WheelDTO> carWheels;
}
