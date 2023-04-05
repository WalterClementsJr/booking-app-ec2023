package com.fpt.common.dto.financial;

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
public class CustomerPointDto extends BaseDto {
    private String customerUuid;
    private Long totalPoint;
    private List<PointHistoryDto> pointHistories;
}
