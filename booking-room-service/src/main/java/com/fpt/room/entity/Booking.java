package com.fpt.room.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDateTime;









public class Booking extends BaseEntity {

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


    private Room room;

    private Payment payment;
}
