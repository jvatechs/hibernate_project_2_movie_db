package org.jvatechs.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "customer", schema = "movie")
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Short customerId;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    private String email;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "active", columnDefinition = "BIT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isActive;

    @Column(name = "create_date")
    @CreationTimestamp
    private LocalDateTime createDate;

    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lastUpdate;
}
