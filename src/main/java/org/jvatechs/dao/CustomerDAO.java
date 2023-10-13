package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.entities.Customer;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
