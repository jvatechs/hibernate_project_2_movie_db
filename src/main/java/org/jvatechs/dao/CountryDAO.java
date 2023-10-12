package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.domain.Country;

public class CountryDAO extends GenericDAO<Country> {
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
