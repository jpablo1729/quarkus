package org.acme.getting.started.entity;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class AutoRepository implements PanacheRepository<Auto> {
    
    public List<Auto> findByMark(String mark){
        return list("mark", mark);
    }

    public List<Auto> findByColor(String color){
        return list("color", color);
    }

}