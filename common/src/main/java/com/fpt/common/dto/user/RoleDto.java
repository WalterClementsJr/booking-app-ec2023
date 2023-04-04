package com.fpt.common.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fpt.common.dto.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;


@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class RoleDto extends BaseDto {
    private String name;
    @JsonIgnore
    private List<Privilege> privilege;
}
