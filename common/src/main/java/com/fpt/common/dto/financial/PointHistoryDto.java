package com.fpt.common.dto.financial;

import com.fpt.common.dto.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class PointHistoryDto extends BaseDto {
    private String customerUuid;
    private String bookingUuid;
    private Long point;
    private LocalDateTime pointDate;
    private CustomerPointDto customerPoint;
}
