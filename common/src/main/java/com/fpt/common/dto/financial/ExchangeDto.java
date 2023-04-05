package com.fpt.common.dto.financial;


import com.fpt.common.dto.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class ExchangeDto extends BaseDto {
    private LocalDate exchangeDate;
    private String exchangedItem;
    private Long exchangedPoints;
    private CustomerPointDto point;
}
