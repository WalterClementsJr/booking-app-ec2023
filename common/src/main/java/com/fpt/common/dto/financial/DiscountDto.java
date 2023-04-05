package com.fpt.common.dto.financial;

import com.fpt.common.dto.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class DiscountDto extends BaseDto {
    private String customerUuid;
    private String name;
    private Double discountPercent;
    private String roomTypeUuid;
}
