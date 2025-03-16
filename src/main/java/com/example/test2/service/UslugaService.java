package com.example.test2.service;

import com.example.test2.model.Usluga;
import com.example.test2.repository.UslugaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class UslugaService {

    private final UslugaRepository uslugaRepository;

    private EntityManager em;


    public UslugaService(UslugaRepository uslugaRepository, EntityManager em) {
        this.uslugaRepository = uslugaRepository;
        this.em = em;
    }

    public List<Usluga> getAllUslugas() {
        List<Usluga> allUslugas = em.createQuery("from Usluga", Usluga.class).getResultList();
        System.out.println("alluslugas "+allUslugas);
        return allUslugas;
    }

}
