package com.fpt.financial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
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
@Table(name = "discount")
@NoArgsConstructor
public class Discount extends BaseEntity {
    @Column(name = "customer_uuid")
    private UUID customerUuid;
    @Column(name = "name")
    private String name;
    @Column(name = "discount_percent")
    private Double discountPercent;
    @Column(name = "room_type_uuid")
    private UUID roomTypeUuid;
}
