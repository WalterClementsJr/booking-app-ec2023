package com.fpt.financial.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "point_history")
@NoArgsConstructor
public class PointHistory extends BaseEntity {
    @Column(name = "customer_uuid")
    private UUID customerUuid;
    @Column(name = "booking_uuid")
    private UUID bookingUuid;
    @Column(name = "point")
    private Long point;
    @Column(name = "point_date")
    private LocalDateTime pointDate;
    @ManyToOne
    @JoinColumn(name = "customer_point_id")
    private CustomerPoint customerPoint;
}
