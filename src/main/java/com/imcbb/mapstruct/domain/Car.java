package com.imcbb.mapstruct.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author kevin.chen
 * Date 2023/3/29
 * Time 10:13
 */
@Data
@Builder
public class Car {
    private String color;
    private int weight;
    private List<Wheel> wheels;

}
