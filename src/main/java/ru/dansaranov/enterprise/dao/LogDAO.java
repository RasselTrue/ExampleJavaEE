package ru.dansaranov.enterprise.dao;

import ru.dansaranov.enterprise.entity.Log;

import javax.ejb.Stateless;

@Stateless
public class LogDAO extends AbstractDAO{

    public void start() {
        em.persist(new Log("Application started"));
    }

    public void stop() {
        em.persist(new Log("Application stopped"));
    }
}
