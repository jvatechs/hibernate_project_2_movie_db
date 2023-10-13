package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.entities.Payment;

public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
