package com.example.test2.service;

import com.example.test2.model.Usluga;
import com.example.test2.repository.UslugaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UslugaService implements UslugaRepository {

    private final UslugaRepository uslugaRepository;

    private EntityManager em;

@Autowired
    public UslugaService(UslugaRepository uslugaRepository, EntityManager em) {
        this.uslugaRepository = uslugaRepository;
        this.em = em;
    }

    public List<Usluga> getAllUslugas() {
        List<Usluga> allUslugas = em.createQuery("from Usluga", Usluga.class).getResultList();
        System.out.println("alluslugas "+allUslugas);
        return allUslugas;
    }

    @Override
    public List<Usluga> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Usluga> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Usluga> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Usluga entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Usluga> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Usluga> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Usluga> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Usluga> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Usluga> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Usluga> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Usluga> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Usluga getOne(Long aLong) {
        return null;
    }

    @Override
    public Usluga getById(Long aLong) {
        return null;
    }

    @Override
    public Usluga getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Usluga> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Usluga> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Usluga> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Usluga> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Usluga> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Usluga> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Usluga, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
