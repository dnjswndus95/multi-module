package com.example.chargingstationadmin.service;

import com.example.chargingstationcore.dto.ChargingStationDetailInfo;
import com.example.chargingstationcore.service.ChargingStationCoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChargingStationServiceForAdmin {

    private final ChargingStationCoreService chargingStationCoreService;
    // 주석 추가

    public ChargingStationDetailInfo.responseDto getStationInfo(ChargingStationDetailInfo.requestDto requestDto) {
        return this.chargingStationCoreService.getStationInfo(requestDto);
    }
}
