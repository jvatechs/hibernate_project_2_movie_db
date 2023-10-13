package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.entities.Address;

public class AddressDAO extends GenericDAO<Address> {
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
