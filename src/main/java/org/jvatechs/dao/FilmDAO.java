package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.domain.Film;

public class FilmDAO extends GenericDAO<Film> {
    public FilmDAO(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }
}
