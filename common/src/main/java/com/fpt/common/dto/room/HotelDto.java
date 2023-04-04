package com.fpt.common.dto.room;

import com.fpt.common.dto.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;


@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class HotelDto extends BaseDto {

    private String name;

    private String address;

    private String location;

    private String phoneNumber;

    private String email;

    private String starRating;

    private LocalTime checkInTime;

    private LocalTime checkOutTime;

    private String description;
}
