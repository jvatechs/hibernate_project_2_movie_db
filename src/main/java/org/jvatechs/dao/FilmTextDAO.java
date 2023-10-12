package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.domain.FilmText;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
