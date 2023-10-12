package org.jvatechs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "language")
@Getter
@Setter
public class Language {
    @Id
    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "name")
    private Integer name;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
