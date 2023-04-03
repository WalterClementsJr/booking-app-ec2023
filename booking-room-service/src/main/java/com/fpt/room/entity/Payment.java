package com.fpt.room.entity;


import com.fpt.common.enums.PaymentMethod;
import com.fpt.common.enums.PaymentStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "payment")
@NoArgsConstructor
public class Payment extends BaseEntity {
    @Column(name = "room_number")
    private String roomNumber;
    @Column(name = "payment_method")
    private PaymentMethod paymentMethod;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "total_price")
    private BigDecimal totalPrice;
    @Column(name = "status")
    private PaymentStatus status;
    @Column(name = "is_refunded")
    private Boolean isRefunded;

    @OneToOne
    @JoinColumn(name = "booking_id", referencedColumnName = "id")
    private Booking booking;
}
