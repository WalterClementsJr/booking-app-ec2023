package com.fpt.financial.entity;

import com.fpt.common.enums.PromotionStatus;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "promotion")
@NoArgsConstructor
public class Promotion extends BaseEntity {
    @Column(name = "room_uuid")
    private UUID roomUuid;
    @Column(name = "promotion_name")
    private String promotionName;
    @Column(name = "start_date")
    private LocalDateTime startDate;
    @Column(name = "end_date")
    private LocalDateTime endDate;
    @Column(name = "discount_percent")
    private Double discountPercent;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private PromotionStatus status;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "promotion")
    private List<PromotionUsage> promotionUsage;
}
