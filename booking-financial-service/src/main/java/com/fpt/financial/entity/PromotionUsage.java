package com.fpt.financial.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.UUID;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "promotion_usage")
@NoArgsConstructor
public class PromotionUsage extends BaseEntity {
    @Column(name = "customer_uuid")
    private UUID customerUuid;
    @Column(name = "booking_uuid")
    private UUID bookingUuid;
    @Column(name = "discount_amount")
    private Double discountAmount;

    @ManyToOne
    @JoinColumn(name="promotion_id")
    private Promotion promotion;
}
