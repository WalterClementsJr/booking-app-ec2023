package com.fpt.room.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;









public class Room extends BaseEntity {

    private String roomNumber;

    private String status;

    private String amenities;

    private String image;


    private RoomType roomType;


    private Hotel hotel;
}
