package com.fpt.user.entity;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "retailer")
@NoArgsConstructor
public class Retailer extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "taxNumber")
    private String taxNumber;
    @Column(name = "is_official")
    private Boolean isOfficial;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
