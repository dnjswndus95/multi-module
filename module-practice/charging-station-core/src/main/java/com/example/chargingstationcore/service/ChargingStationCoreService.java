package com.example.chargingstationcore.service;

import com.example.chargingstationcore.dto.ChargingStationDetailInfo;
import com.example.chargingstationcore.repository.ChargingStationRepository;
import com.example.chargingstationcore.repository.entity.ChargingStation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


@Slf4j
@Service
@RequiredArgsConstructor
public class ChargingStationCoreService {

    private final ChargingStationRepository chargingStationRepository;

    public ChargingStationDetailInfo.responseDto getStationInfo(ChargingStationDetailInfo.requestDto requestDto) {
        System.out.println("===========> " + requestDto.getChargingStationId());
        ChargingStation chargingStation = this.chargingStationRepository
                .findById(UUID.fromString(requestDto.getChargingStationId()))
                .orElseThrow(() -> new IllegalArgumentException("zz"));

        return ChargingStationDetailInfo.responseDto
                .builder()
                .chargingStationId(chargingStation.getId().toString())
                .chargingStationName(chargingStation.getName())
                .createDate(chargingStation.getCreateDate())
                .build();
    }
}
