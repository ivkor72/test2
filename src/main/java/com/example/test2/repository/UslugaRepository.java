package com.example.test2.repository;

import com.example.test2.model.Usluga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UslugaRepository extends JpaRepository<Usluga, Long> {

     default List<Usluga> findAll(){
        return findAll();
    }
}
