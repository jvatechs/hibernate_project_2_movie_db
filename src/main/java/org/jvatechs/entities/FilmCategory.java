package org.jvatechs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "film_category")
@Getter
@Setter
public class FilmCategory {
    @Id
    @Column(name = "film_id")
    private Integer filmId;

    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
