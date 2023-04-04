package com.fpt.common.dto.room;


import com.fpt.common.dto.BaseDto;
import com.fpt.common.enums.PaymentMethod;
import com.fpt.common.enums.PaymentStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;


@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class PaymentDto extends BaseDto {

    private String roomNumber;

    private PaymentMethod paymentMethod;

    private BigDecimal totalPrice;

    private PaymentStatus status;

    private Boolean isRefunded;
    private BookingDto booking;
}
