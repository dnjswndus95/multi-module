package com.example.chargingstationcore.repository;

import com.example.chargingstationcore.repository.entity.ChargingStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.UUID;

@EnableJpaRepositories
public interface ChargingStationRepository extends JpaRepository<ChargingStation, UUID> {
}
