package com.example.chargingstationadmin.controller;

import com.example.chargingstationadmin.service.ChargingStationServiceForAdmin;
import com.example.chargingstationcore.dto.ChargingStationDetailInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/charging-station/admin")
public class ChargingStationControllerForAdmin {

    private final ChargingStationServiceForAdmin chargingStationServiceForAdmin;

    @PostMapping("/info")
    public ChargingStationDetailInfo.responseDto getStationInfo(@RequestBody ChargingStationDetailInfo.requestDto requestDto) {
        return this.chargingStationServiceForAdmin.getStationInfo(requestDto);
    }
}
