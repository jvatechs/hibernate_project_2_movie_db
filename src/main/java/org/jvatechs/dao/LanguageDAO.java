package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.entities.Language;

public class LanguageDAO extends GenericDAO<Language> {
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
