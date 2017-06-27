package com.pluralsight.bookstore.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.security.PrivateKey;

/**
 * Created by k4j4n on 6/27/17.
 */
public class BookRepository {

    @PersistenceContext(unitName = "bookStorePU")
    private EntityManager em;

    public Book find(Long id){
        return em.find(Book.class, id);
    }

    public Book create(Book book){
        em.persist(book);
        return book;
    }

    public void delete(Long id){
        em.remove(em.getReference(Book.class, id));
    }
}
