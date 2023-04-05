package com.fpt.room.entity;

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

import java.time.LocalTime;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "hotel")
@NoArgsConstructor
public class Hotel extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "location")
    private String location;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "star_rating")
    private String starRating;
    @Column(name = "check_in_time")
    private LocalTime checkInTime;
    @Column(name = "check_out_time")
    private LocalTime checkOutTime;
    @Column(name = "description")
    private String description;
}
