package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.domain.Address;

public class AddressDAO extends GenericDAO<Address> {
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
