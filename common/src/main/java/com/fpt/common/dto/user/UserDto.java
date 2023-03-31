package com.fpt.common.dto.user;

import com.fpt.common.dto.AddressDto;
import com.fpt.common.dto.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class UserDto extends BaseDto {
    private String username;
    private String email;
    private String name;
    private LocalDate birthdate;
    private List<AddressDto> addresses;
}
