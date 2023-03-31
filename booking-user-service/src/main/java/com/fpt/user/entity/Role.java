package com.fpt.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;


@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "booking_role")
@NoArgsConstructor
public class Role extends BaseEntity {
    @Column(name = "name", unique = true)
    private String name;

    @OneToMany(mappedBy = "role")
    @JsonIgnore
    private List<Privilege> privilege;

}
