package com.fpt.common.dto.financial;

import com.fpt.common.dto.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class PromotionUsageDto extends BaseDto {
    private UUID customerUuid;
    private UUID bookingUuid;
    private Double discountAmount;
    private PromotionDto promotion;
}
