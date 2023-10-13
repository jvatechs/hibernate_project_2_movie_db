package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.entities.Inventory;

public class InventoryDAO extends GenericDAO<Inventory> {
    public InventoryDAO(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
