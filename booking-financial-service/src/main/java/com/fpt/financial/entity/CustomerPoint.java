package com.fpt.financial.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;
import java.util.UUID;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "customer_point")
@NoArgsConstructor
public class CustomerPoint extends BaseEntity {
    @Column(name = "customer_uuid")
    private UUID customerUuid;
    @Column(name = "total_point")
    private Long totalPoint;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "point")
    private List<PointHistory> pointHistories;
}
