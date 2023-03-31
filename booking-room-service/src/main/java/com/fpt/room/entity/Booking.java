package com.fpt.room.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "booking")
@NoArgsConstructor
public class Booking extends BaseEntity {

    @Column(name = "check_in_date")
    private LocalDateTime checkInDate;
    @Column(name = "check_out_date")
    private LocalDateTime checkOutDate;

    @Column(name = "passenger_count")
    private Integer passengerCount;
    @Column(name = "location")
    private String location;

    @Column(name = "special_requests")
    private String special_requests;

}
