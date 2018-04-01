package com.in28minutes.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.database.databasedemo.entity.PersonJpa;

@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<PersonJpa> findAll() {
        final TypedQuery<PersonJpa> namedQuery = entityManager.createNamedQuery("find_all_persons", PersonJpa.class);
        return namedQuery.getResultList();
    }

    public PersonJpa findById(final int id) {
        return entityManager.find(PersonJpa.class, id);
    }

    public PersonJpa update(final PersonJpa person) {
        return entityManager.merge(person);
    }

    public PersonJpa insert(final PersonJpa person) {
        return entityManager.merge(person);
    }

    public void deleteById(final int id) {
        final PersonJpa person = this.findById(id);
        entityManager.remove(person);
    }
}
