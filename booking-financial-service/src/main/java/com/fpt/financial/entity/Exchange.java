package com.fpt.financial.entity;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "exchange")
@NoArgsConstructor
public class Exchange extends BaseEntity {
    @Column(name = "exchange_date")
    private LocalDate exchangeDate;
    @Column(name = "exchanged_item")
    private String exchangedItem;
    @Column(name = "exchanged_points")
    private Long exchangedPoints;

    @ManyToOne
    @JoinColumn(name = "point_id")
    private CustomerPoint point;
}
