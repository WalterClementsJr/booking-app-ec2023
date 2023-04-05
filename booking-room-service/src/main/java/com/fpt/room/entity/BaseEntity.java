package com.fpt.room.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.github.f4b6a3.uuid.UuidCreator;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;






public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;



    protected Long id;

    private UUID uuid;


    private UUID createdBy;


    private UUID updatedBy;





    private LocalDateTime createdTime;





    private LocalDateTime updatedTime;


    private void prePersist() {
        if (uuid == null) {
            // generate a uuid v7 for faster indexing. it's also fast as fuck (9x UUID.randomUUID())
            this.setUuid(UuidCreator.getTimeOrderedEpochPlus1());
        }
    }


    private void preUpdate() {
        this.updatedTime = LocalDateTime.now();
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return id.equals(that.id);
    }


    public int hashCode() {
        return id.hashCode();
    }
}
