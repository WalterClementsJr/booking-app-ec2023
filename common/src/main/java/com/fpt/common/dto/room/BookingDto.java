package com.fpt.common.dto.room;

import com.fpt.common.dto.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class BookingDto extends BaseDto {

    private LocalDateTime checkInDate;

    private LocalDateTime checkOutDate;

    private Integer passengerCount;

    private String location;

    private String specialRequests;

    private String promotionUsageId;

    private String discountUuid;

    private String pointUuid;

    private BigDecimal totalPrice;

    private Integer quantity;

    private BigDecimal price;

    private BigDecimal totalAmount;
    private RoomDto room;
    private PaymentDto payment;
}
