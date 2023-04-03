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
public class Privilege extends BaseDto {
    private String name;
    private RoleDto role;
}
