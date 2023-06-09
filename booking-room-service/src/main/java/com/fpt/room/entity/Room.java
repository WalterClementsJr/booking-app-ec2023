package com.fpt.room.entity;

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
@Table(name = "room")
@NoArgsConstructor
public class Room extends BaseEntity {
    @Column(name = "room_number")
    private String roomNumber;
    @Column(name = "status")
    private String status;
    @Column(name = "amenities")
    private String amenities;
    @Column(name = "image")
    private String image;
    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
}
