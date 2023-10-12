package org.jvatechs.dao;

import org.hibernate.SessionFactory;
import org.jvatechs.domain.Category;

public class CategoryDAO extends GenericDAO<Category> {
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
