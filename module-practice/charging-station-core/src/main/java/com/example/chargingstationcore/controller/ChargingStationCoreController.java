package com.example.chargingstationcore.controller;

import com.example.chargingstationcore.dto.ChargingStationDetailInfo;
import com.example.chargingstationcore.repository.entity.ChargingStation;
import com.example.chargingstationcore.service.ChargingStationCoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping(value = "/charging-station/common")
@RequiredArgsConstructor
public class ChargingStationCoreController {

    private final ChargingStationCoreService chargingStationCoreService;

    @PostMapping("/station/info")
    public ChargingStationDetailInfo.responseDto getStationInfo(@RequestBody ChargingStationDetailInfo.requestDto requestDto) {
        return this.chargingStationCoreService.getStationInfo(requestDto);
    }

}
