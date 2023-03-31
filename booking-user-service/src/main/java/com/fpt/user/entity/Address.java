package com.fpt.user.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;


@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "address")
@NoArgsConstructor
public class Address extends BaseEntity {
    @Column(name = "location")
    private String location;
    @Column(name = "remark")
    private String remark;
    @ManyToOne
    private User user;
}
