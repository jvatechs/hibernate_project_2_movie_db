package org.jvatechs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "film_actor")
@Getter
@Setter
public class FilmActor {
    @Id
    @Column(name = "actor_id")
    private Integer actorId;

    @Id
    @Column(name = "film_id")
    private Integer filmId;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
