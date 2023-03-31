package com.fpt.user.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "privilege")
@NoArgsConstructor
public class Privilege extends BaseEntity {
    @Column(name = "name")
    private String name;

    @ManyToOne
    private Role role;
}
