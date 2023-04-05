package com.fpt.common.dto.financial;

import com.fpt.common.dto.BaseDto;
import com.fpt.common.enums.PromotionStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class PromotionDto extends BaseDto {
    private String roomUuid;
    private String promotionName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Double discountPercent;
    private PromotionStatus status;
    private List<PromotionUsageDto> promotionUsage;
}
