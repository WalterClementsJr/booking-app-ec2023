package com.fpt.room.entity;


import com.fpt.common.enums.PaymentMethod;
import com.fpt.common.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;









public class Payment extends BaseEntity {

    private String roomNumber;


    private PaymentMethod paymentMethod;

    private BigDecimal totalPrice;


    private PaymentStatus status;

    private Boolean isRefunded;



    private Booking booking;
}
