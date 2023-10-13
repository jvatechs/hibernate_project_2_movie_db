package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.entities.Staff;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
