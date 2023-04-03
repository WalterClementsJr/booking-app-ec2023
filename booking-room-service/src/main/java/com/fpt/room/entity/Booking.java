package com.fpt.room.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "booking")
@NoArgsConstructor
public class Booking extends BaseEntity {
    @Column(name = "check_in_date")
    private LocalDateTime checkInDate;
    @Column(name = "check_out_date")
    private LocalDateTime checkOutDate;
    @Column(name = "passenger_count")
    private Integer passengerCount;
    @Column(name = "location")
    private String location;
    @Column(name = "special_requests")
    private String specialRequests;
    @Column(name = "promotion_usage_id")
    private String promotionUsageId;
    @Column(name = "discount_uuid")
    private String discountUuid;
    @Column(name = "point_uuid")
    private String pointUuid;
    @Column(name = "total_price")
    private BigDecimal totalPrice;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "total_amount")
    private BigDecimal totalAmount;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id")
    private Room room;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "booking")
    private Payment payment;
}
