package com.fpt.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;


@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "role")
@NoArgsConstructor
public class Role extends BaseEntity {
    @Column(name = "name", unique = true)
    private String name;

    @OneToMany(mappedBy = "role")
    @JsonIgnore
    private List<Privilege> privilege;

}
