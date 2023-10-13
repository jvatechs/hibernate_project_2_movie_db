package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.entities.Actor;

public class ActorDAO extends GenericDAO<Actor> {

    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
