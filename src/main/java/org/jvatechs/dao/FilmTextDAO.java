package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.entities.FilmText;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
