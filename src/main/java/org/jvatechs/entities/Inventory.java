package org.jvatechs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
@Getter
@Setter
public class Inventory {
    @Id
    @Column(name = "inventory_id")
    private Integer inventoryId;

    @Column(name = "film_id")
    private Integer filmId;

    @Column(name = "store_id")
    private Integer storeId;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
