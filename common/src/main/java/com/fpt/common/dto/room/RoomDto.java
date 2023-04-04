package com.fpt.common.dto.room;

import com.fpt.common.dto.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class RoomDto extends BaseDto {

    private String roomNumber;

    private String status;

    private String amenities;

    private String image;
    private RoomTypeDto roomType;
    private HotelDto hotel;
}
