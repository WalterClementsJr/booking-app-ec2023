package com.fpt.user.entity;


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
@Table(name = "address")
@NoArgsConstructor
public class Address extends BaseEntity {
    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "entity_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
    @Column(name = "id")
    private Long id;
    @Column(name = "location")
    private String location;
    @Column(name = "remark")
    private String remark;
    @ManyToOne
    private User user;
}
