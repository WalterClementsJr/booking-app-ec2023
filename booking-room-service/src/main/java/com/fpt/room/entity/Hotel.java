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









public class Hotel extends BaseEntity {

    private String name;

    private String address;

    private String location;

    private String phoneNumber;

    private String email;

    private String starRating;

    private LocalTime checkInTime;

    private LocalTime checkOutTime;

    private String description;
}
