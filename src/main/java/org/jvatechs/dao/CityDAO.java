package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.jvatechs.domain.City;


public class CityDAO extends GenericDAO<City> {
    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public City getByName(String cityName) {
        Query<City> query = getCurrentSession().createQuery("select c from City c where c.city = :name", City.class);
        query.setParameter("name", cityName);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
