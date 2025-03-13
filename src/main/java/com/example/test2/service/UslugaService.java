package com.example.test2.service;

import com.example.test2.model.Usluga;
import com.example.test2.repository.UslugaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UslugaService {

    private final UslugaRepository uslugaRepository;


    public UslugaService(UslugaRepository uslugaRepository) {
        this.uslugaRepository = uslugaRepository;
    }

    public List<Usluga> getAllUslugas() {
        List<Usluga> allUslugas = uslugaRepository.findAll();
        return allUslugas;
    }

}
