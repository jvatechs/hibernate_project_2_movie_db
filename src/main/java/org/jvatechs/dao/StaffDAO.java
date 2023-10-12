package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.domain.Staff;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
