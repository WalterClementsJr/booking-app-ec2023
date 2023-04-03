package com.fpt.common.dto.room;

import com.fpt.common.dto.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class RoomTypeDto extends BaseDto {

    private String name;

    private String description;

    private Integer maxOccupancy;

    private BigDecimal basePrice;
}
