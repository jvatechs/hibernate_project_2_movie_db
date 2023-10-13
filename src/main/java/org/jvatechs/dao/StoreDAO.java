package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.entities.Store;

public class StoreDAO extends GenericDAO<Store> {
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
