package com.fpt.user.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "booking_user")
@NoArgsConstructor
public class User extends BaseEntity implements Serializable {
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "birthdate")
    private LocalDate birthdate;
    @Column(name = "expired")
    private boolean expired;
    @Column(name = "locked")
    private boolean locked;
    @Column(name = "disabled")
    private boolean disabled;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Address> addresses;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
    private Retailer retailer;
}
