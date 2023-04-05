package com.fpt.common.dto.user;


import com.fpt.common.dto.BaseDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class AddressDto extends BaseDto {
    private String location;
    private String remark;
}
