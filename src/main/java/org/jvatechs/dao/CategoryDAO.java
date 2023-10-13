package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.entities.Category;

public class CategoryDAO extends GenericDAO<Category> {
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
