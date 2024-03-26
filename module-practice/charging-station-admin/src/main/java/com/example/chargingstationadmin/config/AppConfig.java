package com.example.chargingstationadmin.config;

import com.example.chargingstationcore.repository.ChargingStationRepository;
import com.example.chargingstationcore.repository.entity.ChargingStation;
import com.example.chargingstationcore.service.ChargingStationCoreService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

@Configuration
public class AppConfig {

    @Bean
    public ChargingStationCoreService chargingStationCoreService() {
        ChargingStationCoreService chargingStationCoreService = new ChargingStationCoreService(chargingStationRepository());

        return chargingStationCoreService;
    }

    @Bean
    public ChargingStationRepository chargingStationRepository() {
        return new ChargingStationRepository() {
            @Override
            public void flush() {

            }

            @Override
            public <S extends ChargingStation> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends ChargingStation> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<ChargingStation> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<UUID> uuids) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public ChargingStation getOne(UUID uuid) {
                return null;
            }

            @Override
            public ChargingStation getById(UUID uuid) {
                return null;
            }

            @Override
            public ChargingStation getReferenceById(UUID uuid) {
                return null;
            }

            @Override
            public <S extends ChargingStation> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends ChargingStation> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends ChargingStation> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public List<ChargingStation> findAll() {
                return null;
            }

            @Override
            public List<ChargingStation> findAllById(Iterable<UUID> uuids) {
                return null;
            }

            @Override
            public <S extends ChargingStation> S save(S entity) {
                return null;
            }

            @Override
            public Optional<ChargingStation> findById(UUID uuid) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(UUID uuid) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(UUID uuid) {

            }

            @Override
            public void delete(ChargingStation entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends UUID> uuids) {

            }

            @Override
            public void deleteAll(Iterable<? extends ChargingStation> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public List<ChargingStation> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<ChargingStation> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends ChargingStation> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends ChargingStation> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends ChargingStation> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends ChargingStation> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends ChargingStation, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
    }
}
