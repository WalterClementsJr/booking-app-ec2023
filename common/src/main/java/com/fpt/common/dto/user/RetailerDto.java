package com.fpt.common.dto.user;


import com.fpt.common.dto.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class RetailerDto extends BaseDto {
    private String name;
    private String taxNumber;
    private Boolean isOfficial;
    private UserDto user;
}
