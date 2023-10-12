package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.domain.Rental;

public class RentalDAO extends GenericDAO<Rental> {
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }
}
