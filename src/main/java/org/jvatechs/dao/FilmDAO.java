package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.jvatechs.entities.Film;



public class FilmDAO extends GenericDAO<Film> {
    public FilmDAO(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }

    public Film getFirstAvailableFilm() {
        Query<Film> query = getCurrentSession().createQuery("select f from Film f where f.id NOT IN " +
                "(select distinct i.film from Inventory i)", Film.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
