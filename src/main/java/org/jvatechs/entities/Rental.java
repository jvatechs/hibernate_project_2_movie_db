package org.jvatechs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "rental")
@Setter
@Getter
public class Rental {
    @Id
    @Column(name = "rental_id")
    private Integer rentalId;

    @Column(name = "rental_date")
    private LocalDateTime rentalDate;

    @Column(name = "inventory_id")
    private Integer inventoryId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "return_date")
    private LocalDateTime returnDate;

    @Column(name = "staff_id")
    private Integer staffId;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
